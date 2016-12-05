package AoC2016.Day4

import scala.io.Source

object Puzzle1 {

  def apply(inputFile: Source) = {

    var rooms = List[Room]()

    inputFile.getLines().foreach(str => {
      rooms = Room(str) :: rooms
    })

    val sum = rooms.filter(_.isRealRoom).map(_.getSectorId).sum

    println("Sum of sector IDs: " + sum)

  }

}
