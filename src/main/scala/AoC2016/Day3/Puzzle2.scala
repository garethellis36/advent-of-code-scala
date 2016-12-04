package AoC2016.Day3

import scala.io.Source

object Puzzle2 {

  def apply(inputFile: Source) = {

    var triangles = List[Triangle]()

    val allSpecs = inputFile.mkString.trim.split("[\\s|\\n]+")

    0 to 2 foreach(i => {
      allSpecs.drop(i).grouped(3).map(_.head).grouped(3).foreach(arr => {
        triangles = Triangle(arr(0).toInt, arr(1).toInt, arr(2).toInt) :: triangles
      })
    })

    println("Number of valid triangles: " + triangles.filter(_.isValid).length)
  }

}
