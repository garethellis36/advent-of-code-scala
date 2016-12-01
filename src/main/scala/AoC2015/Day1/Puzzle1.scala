package AoC2015.Day1

import scala.io.Source

object Puzzle1 {

  def apply(source: Source): Unit = {

    println(InstructionsParser(source, new Lift).parse.getCurrentFloor)

  }

}

