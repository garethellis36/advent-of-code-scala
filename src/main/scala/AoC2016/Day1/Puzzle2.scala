package AoC2016.Day1

import scala.io.Source

object Puzzle2 {
  def apply(inputFile: Source) = {
    val person = Person(0, 0)
    person.follow(Directions(inputFile))
    val locationHistory = person.getLocationHistory
    val easterBunnyHq = locationHistory.diff(locationHistory.distinct).distinct.toList(0)
    val numBlocksAway = +easterBunnyHq.x + +easterBunnyHq.y
    println("Easter Bunny HQ is " + numBlocksAway + " blocks away")
  }
}
