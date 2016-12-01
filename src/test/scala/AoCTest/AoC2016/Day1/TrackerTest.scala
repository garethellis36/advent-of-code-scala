package AoCTest.AoC2016.Day1

import AoC2016.Day1._
import org.scalatest._

class TrackerTest extends FlatSpec with Matchers {

  "A Tracker" should "record a location" in {
    val tracker = new AoC2016.Day1.Tracker
    tracker record Location(0, 0)
    tracker.getHistory should be(List(Location(0, 0)))
  }

  "A Tracker" should "have a list of all recorded locations in the correct order" in {
    val tracker = new AoC2016.Day1.Tracker
    tracker record Location(0, 0)
    tracker record Location(1, 0)
    tracker record Location(2, 0)
    tracker record Location(2, 2)
    tracker.getHistory should be(List(Location(0, 0), Location(1, 0), Location(2, 0), Location(2, 2)))
  }

}
