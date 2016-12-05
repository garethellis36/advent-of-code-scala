package AoC2016.Day4

import scala.io.Source

object Puzzle2 {

  def apply(inputFile: Source) = {

    var rooms = List[Room]()

    inputFile.getLines().foreach(str => {
      rooms = Room(str) :: rooms
    })

    val cipher = new ShiftCipher
    println("North Pole object storage room sector ID is: " + rooms.filter(_.isRealRoom).filter(room => {
      cipher.decrypt(room.getEncryptedName, room.getSectorId) == "northpole object storage"
    }).apply(0).getSectorId)
  }

}
