package AoC2016.Day3

import scala.io.Source

object Puzzle1 {

  def apply(inputFile: Source) = {

    var triangles = List[Triangle]()

    inputFile.getLines().map(_.trim).foreach(line => {
      val dimensions = line.split("\\s+").map(_.toInt)
      triangles = Triangle(dimensions(0), dimensions(1), dimensions(2)) :: triangles
    })

    println("Number of valid triangles: " + triangles.filter(_.isValid).length)
  }

}
