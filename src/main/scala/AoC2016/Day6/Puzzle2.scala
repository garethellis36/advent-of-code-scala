package AoC2016.Day6

import scala.io.Source

object Puzzle2 {

  def apply(inputFile: Source) = {

    val lines = inputFile.getLines().toList
    val messageUnscrambler = new MessageUnscrambler
    println(messageUnscrambler.unscrambleUsingLeastCommonChars(lines, lines.head.length))

  }

}
