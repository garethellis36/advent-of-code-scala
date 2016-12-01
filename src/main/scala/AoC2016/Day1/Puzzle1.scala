package AoC2016.Day1

import scala.io.Source

object Puzzle1 {
  def apply(inputFile: Source): Unit = {
    val location = Person(0, 0).follow(Directions(inputFile)).getLocation
    val numBlocksAway = +location.x + +location.y
    println("Easter Bunny HQ is " + numBlocksAway + " blocks away")
  }

}
