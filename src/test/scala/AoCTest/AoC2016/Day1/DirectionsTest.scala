package AoCTest.AoC2016.Day1

import AoC2016.Day1.{Directions, Person}
import org.scalatest._
import scala.io.Source

class DirectionsTest extends FlatSpec with Matchers {

  "Directions" must "be able to split a list of directions into individual directions" in {
    val inputFile = Source.fromString("R3, L2, R2")
    val directions = new Directions(inputFile)
    directions.toListOfTuples should be (List(("R",3), ("L",2), ("R",2)))
  }

}
