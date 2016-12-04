package AoC2016.Day2

import scala.io.Source

object Puzzle1 {
  def apply(inputFile: Source): Unit = {

    val keypadOperator = KeypadOperator(5)

    var code = ""

    inputFile.getLines().foreach(line => {
      line.foreach(direction => {

        direction match {
          case 'L' => keypadOperator.moveLeft
          case 'R' => keypadOperator.moveRight
          case 'U' => keypadOperator.moveUp
          case 'D' => keypadOperator.moveDown
        }

      })

      code += keypadOperator.getCurrentNumber
    })

    println("Bathroom code: " + code)
  }
}
