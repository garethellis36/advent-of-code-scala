package AoC2016.Day6

class MessageUnscrambler {

  def unscrambleUsingMostCommonChars(lines: List[String], lineLength: Int) = {
    var unscrambled = ""

    1 to lineLength foreach (i => {
      unscrambled += charOccurrencesAtPosition(i, lines).head._1
    })

    unscrambled
  }

  def unscrambleUsingLeastCommonChars(lines: List[String], lineLength: Int) = {
    var unscrambled = ""

    1 to lineLength foreach (i => {
      unscrambled += charOccurrencesAtPosition(i, lines).last._1
    })

    unscrambled
  }

  private def charOccurrencesAtPosition(position: Int, lines: List[String]) = {
    var charMap = Map[Char, Int]()

    lines.foreach(line => {

      val ch = line.toList(position-1)

      charMap =
        if (charMap.contains(ch))
          charMap + (ch -> (charMap(ch)+1))
        else
          charMap + (ch -> 1)

    })

    charMap.toSeq.sortWith(sortChars).toList
  }

  private def sortChars(a: Tuple2[Char,Int], b: Tuple2[Char,Int]): Boolean = {
    if (a._2 > b._2)
      true
    else
      false
  }

}
