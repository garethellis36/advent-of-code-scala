package AoC2015.Day1

import scala.io.Source

class InstructionsParser(source: Source, lift: Lift) {

  def parse(): Lift = {

    source.foreach(char => char match {
      case '(' => lift.goUp
      case ')' => lift.goDown
    })

    lift
  }

}

object InstructionsParser {
  def apply(source: Source, lift: Lift) = new InstructionsParser(source, lift)
}