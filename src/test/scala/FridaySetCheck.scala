import org.scalacheck.Arbitrary.{arbInt, _}
import org.scalacheck.Gen.{oneOf, _}
import org.scalacheck.Prop._
import org.scalacheck.{Arbitrary, Gen, Properties}


object FridaySetCheck extends Properties("Set Properties"){

  def genInt[T : Arbitrary] = Arbitrary.arbitrary[T]

//  implicit val genSet: Gen[FridaySet[_]] = oneOf(
//    const(EmptySet),
//    for {
//      head <- genInt
//      tail <- genSet
//    } yield tail + head
//  )
//
//  property("check EmptySet") = forAll {
//
//  }
}
