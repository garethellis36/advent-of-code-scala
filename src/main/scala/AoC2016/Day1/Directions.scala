package AoC2016.Day1

import scala.io.Source

class Directions(inputFile: Source) {
  def toListOfTuples: List[Tuple2[String,Int]] = {
    inputFile.mkString.split(", ").map(str => {
      (str.substring(0,1), str.substring(1).toInt)
    }).toList
  }
}

object Directions {
  def apply(inputFile: Source): Directions = new Directions(inputFile)
}
