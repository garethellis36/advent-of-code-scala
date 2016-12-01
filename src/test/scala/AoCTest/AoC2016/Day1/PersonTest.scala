package AoCTest.AoC2016.Day1

import AoC2016.Day1.{Directions, Location, Person}
import org.scalatest._

import scala.io.Source

class PersonTest extends FlatSpec with Matchers {

  "A Person" must "have a location" in {
    val person = Person(0, 0, "N")
    person.getLocation should be(Location(0, 0))
  }

  "A Person" can "turn left and walk forward two blocks" in {
    val person = Person(0, 0, "N")
    person left 2
    person.getLocation should be(Location(-2, 0))
  }

  "A Person" can "turn right and walk forward three blocks" in {
    val person = Person(0, 0, "N")
    person right 3
    person.getLocation should be(Location(3, 0))
  }

  "A Person" can "turn left twice" in {
    val person = Person(0, 0, "N")
    person left 2
    person left 2
    person.getLocation should be(Location(-2, -2))
  }

  "A Person" can "turn right twice" in {
    val person = Person(0, 0, "N")
    person right 3
    person right 2
    person.getLocation should be(Location(3, -2))
  }

  "A Person facing South" can "turn left" in {
    val person = Person(0, 0, "S")
    person left 1
    person.getLocation should be(Location(1, 0))
  }

  "A Person facing South" can "turn right" in {
    val person = Person(0, 0, "S")
    person right 999
    person.getLocation should be(Location(-999, 0))
  }

  "A Person facing East" can "turn left" in {
    val person = Person(0, 0, "E")
    person left 5
    person.getLocation should be(Location(0, 5))
  }

  "A Person facing West" can "turn right" in {
    val person = Person(0, 0, "W")
    person right 70
    person.getLocation should be(Location(0, 70))
  }

  "A Person" should "follow directions" in {
    val person = Person(0, 0, "N")
    var inputFile = Source.fromString("R2, L3")
    person follow Directions(inputFile)
    person.getLocation should be(Location(2, 3))
  }
}
