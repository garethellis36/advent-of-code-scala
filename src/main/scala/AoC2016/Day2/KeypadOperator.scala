package AoC2016.Day2

class KeypadOperator(startNumber: Int) {

  private var currentNumber = startNumber

  def getCurrentNumber() = currentNumber

  def moveLeft = {
    currentNumber =
      if (canMoveLeft)
        currentNumber - 1
      else
        currentNumber
  }

  def moveRight = {
    currentNumber =
      if (canMoveRight)
        currentNumber + 1
      else
        currentNumber
  }

  def moveUp = {
    currentNumber =
      if (canMoveUp)
        currentNumber - 3
      else
        currentNumber
  }

  def moveDown = {
    currentNumber =
      if (canMoveDown)
        currentNumber + 3
      else
        currentNumber
  }

  private def canMoveLeft: Boolean = {
    currentNumber != 1 && currentNumber != 4 && currentNumber != 7
  }

  private def canMoveRight = (currentNumber % 3) != 0

  private def canMoveUp = currentNumber > 3

  private def canMoveDown = currentNumber < 7
}

object KeypadOperator {
  def apply(startNumber: Int) = new KeypadOperator(startNumber)
}
