import org.scalatest.funsuite.AnyFunSuite

class FridaySetSuite extends AnyFunSuite {

  test("add 1 element to EmptySet"){
    val number = 4
    val s : FridaySet[Int] = EmptySet() + number
    assert(s.size == 1)
    assert(s(number))
  }

  test("EmptySet"){
    val empty = EmptySet()
    assert(empty.size == 0)
    assert(empty.isEmpty)
  }



}
