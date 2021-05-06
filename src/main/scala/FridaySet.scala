trait FridaySet[A] extends (A => Boolean){
  def size : Int
  def isEmpty: Boolean
  def contains(x: A): Boolean
  def +(x: A): FridaySet[A]
  def ++(xs: FridaySet[A]): FridaySet[A]
  def map[B](f: A => B): FridaySet[B]
  def foreach(f: A => Unit): Unit
  def apply(v: A): Boolean = this.contains(v)
}

case class EmptySet[A]() extends FridaySet[A]{
  override def size: Int = 0

  override def contains(x: A): Boolean = false

  override def +(x: A): FridaySet[A] = NoneEmptySet(x, this)

  override def ++(xs: FridaySet[A]): FridaySet[A] = xs

  override def map[B](f: A => B): FridaySet[B] = EmptySet[B]()

  override def foreach(f: A => Unit): Unit = ()

  override def isEmpty: Boolean = true

}

case class NoneEmptySet[A](head: A, tail: FridaySet[A]) extends FridaySet[A] {
  override def size: Int = tail.size + 1

  override def isEmpty: Boolean = false

  override def contains(x: A): Boolean = head == x || this.tail.contains(x)

  override def +(x: A): FridaySet[A] = NoneEmptySet(x, this)

  override def ++(xs: FridaySet[A]): FridaySet[A] = (xs ++ this.tail) + this.head

  override def map[B](f: A => B): FridaySet[B] = this.tail.map(f) + f(this.head)

  override def foreach(f: A => Unit): Unit = {
    f(this.head)
    this.tail.foreach(f)
  }
}
