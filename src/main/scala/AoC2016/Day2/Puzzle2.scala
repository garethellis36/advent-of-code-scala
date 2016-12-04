package AoC2016.Day2

import scala.io.Source

object Puzzle2 {
  def apply(inputFile: Source): Unit = {

    val keypadOperator = ComplexKeypadOperator('5')

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

      code += keypadOperator.getCurrentKey
    })

    println("Bathroom code: " + code)
  }
}
