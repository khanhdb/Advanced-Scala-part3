
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
  override def size: Int = ???

  override def isEmpty: Boolean = ???

  override def contains(x: A): Boolean = ???

  override def +(x: A): FridaySet[A] = ???

  override def ++(xs: FridaySet[A]): FridaySet[A] = ???

  override def map[B](f: A => B): FridaySet[B] = ???

  override def foreach(f: A => Unit): Unit = ???
}

case class NoneEmptySet[A](head: A, tail: FridaySet[A]) extends FridaySet[A] {
  override def size: Int = ???

  override def isEmpty: Boolean = ???

  override def contains(x: A): Boolean = ???

  override def +(x: A): FridaySet[A] = ???

  override def ++(xs: FridaySet[A]): FridaySet[A] = ???

  override def map[B](f: A => B): FridaySet[B] = ???

  override def foreach(f: A => Unit): Unit = ???
}
