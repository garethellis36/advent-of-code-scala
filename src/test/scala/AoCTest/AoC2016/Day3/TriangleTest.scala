package AoCTest.AoC2016.Day3

import org.scalatest._

import AoC2016.Day3.Triangle

class TriangleTest extends FlatSpec with Matchers {

  "A triangle" should "be valid when the sum of side 1 and side 2 are bigger than side 3" in {
    val triangle = Triangle(4,6,9)
    triangle.isValid should be (true)
  }

  "A triangle" should "be valid when the sum of side 1 and side 3 are bigger than side 2" in {
    val triangle = Triangle(4,9,6)
    triangle.isValid should be (true)
  }

  "A triangle" should "be valid when the sum of side 3 and side 2 are bigger than side 1" in {
    val triangle = Triangle(6,4,9)
    triangle.isValid should be (true)
  }

  "A triangle" should "not be valid with sides 5 10 and 25" in {
    val triangle = Triangle(5,10,25)
    triangle.isValid should be (false)
  }

}
