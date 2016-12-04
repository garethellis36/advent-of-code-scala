package AoC2016.Day2

import scala.util.Try

class ComplexKeypadOperator(startKey: Char) {

  private var currentKey = startKey

  def getCurrentKey = currentKey

  def moveLeft = {
    currentKey =
      if (canMoveLeft)
        currentKey.isDigit match {
          case true => (currentKey.toInt - 1).toChar
          case false => currentKey match {
            case 'B' => 'A'
            case 'C' => 'B'
          }
        }
      else
        currentKey
  }

  def moveRight = {
    currentKey =
      if (canMoveRight)
        currentKey.isDigit match {
          case true => (currentKey.toInt + 1).toChar
          case false => currentKey match {
            case 'A' => 'B'
            case 'B' => 'C'
          }
        }
      else
        currentKey
  }

  def moveUp = {
    currentKey =
      if (canMoveUp)
        currentKey match {
          case 'D' => 'B'
          case 'A' => '6'
          case 'B' => '7'
          case 'C' => '8'
          case '3' => '1'
          case _ => (currentKey.toInt - 4).toChar
        }
      else
        currentKey
  }

  def moveDown = {
    currentKey =
      if (canMoveDown)
        currentKey match {
          case '6' => 'A'
          case '7' => 'B'
          case '8' => 'C'
          case 'B' => 'D'
          case '1' => '3'
          case _ => (currentKey.toInt + 4).toChar
        }
      else
        currentKey
  }

  private def canMoveLeft = {
    currentKey != '1' && currentKey != '2' && currentKey != '5' && currentKey != 'A' && currentKey != 'D'
  }

  private def canMoveRight = {
    currentKey != '1' && currentKey != '4' && currentKey != '9' && currentKey != 'C' && currentKey != 'D'
  }

  private def canMoveUp = {
    currentKey != '1' && currentKey != '2' && currentKey != '5' && currentKey != '4' && currentKey != '9'
  }

  private def canMoveDown = {
    currentKey != '5' && currentKey != 'A' && currentKey != 'D' && currentKey != 'C' && currentKey != '9'
  }
}

object ComplexKeypadOperator {
  def apply(startKey: Char): ComplexKeypadOperator = new ComplexKeypadOperator(startKey)
}

