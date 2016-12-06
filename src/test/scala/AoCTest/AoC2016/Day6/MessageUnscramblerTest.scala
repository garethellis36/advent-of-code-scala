package AoCTest.AoC2016.Day6

import AoC2016.Day6.MessageUnscrambler
import org.scalatest._
import scala.io.Source

class MessageUnscramblerTest extends FlatSpec with Matchers {

  "A MessageUnscrambler" should "unscramble the test input to 'easter'" in {
    val messageUnscrambler = new MessageUnscrambler
    val path = getClass.getResource("").getPath + "../../../../../../src/test/resources/"
    val inputFile = Source.fromFile(path + "/2016/day6_test")

    messageUnscrambler.unscrambleUsingMostCommonChars(inputFile.getLines().toList, 6) should be ("easter")
  }

  "A MessageUnscrambler" should "unscramble the test input to 'advent' using least common chars" in {
    val messageUnscrambler = new MessageUnscrambler
    val path = getClass.getResource("").getPath + "../../../../../../src/test/resources/"
    val inputFile = Source.fromFile(path + "/2016/day6_test")

    messageUnscrambler.unscrambleUsingLeastCommonChars(inputFile.getLines().toList, 6) should be ("advent")
  }

}
