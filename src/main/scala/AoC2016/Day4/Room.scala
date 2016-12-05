package AoC2016.Day4

import scala.collection.mutable.Map

class Room(code: String) {

  private val codePieces = code.split("-")
  private val sectorId = codePieces.last.split("\\[").head.toInt
  private val apparentChecksum = codePieces.last.split("\\[").last.replace("]", "")

  def getSectorId = sectorId

  def getApparentChecksum = apparentChecksum

  def getEncryptedName = codePieces.dropRight(1).reduce(_+"-"+_)

  def getActualChecksum = {
    var chars = Map[Char,Int]()

    getEncryptedName.replace("-", "").foreach(char => {

      if (chars.contains(char))
        chars = chars + (char -> (chars(char) + 1))
      else
        chars = chars + (char -> 1)
    })

    chars.toSeq.sortWith(sortChars).toList.take(5).map(_._1.toString).reduce(_+_)
  }

  def isRealRoom = { getApparentChecksum == getActualChecksum }

  private def sortChars(a: Tuple2[Char,Int], b: Tuple2[Char,Int]): Boolean = {
    if (a._2 > b._2)
      true
    else if (b._2 > a._2)
      false
    else
      a._1 < b._1
  }
}

object Room {
  def apply(code: String): Room = new Room(code)
}