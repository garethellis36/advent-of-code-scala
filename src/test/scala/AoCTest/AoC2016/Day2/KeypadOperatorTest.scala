package AoCTest.AoC2016

import AoC2016.Day2.KeypadOperator
import org.scalatest._

class KeypadOperatorTest extends FlatSpec with Matchers {

  "A KeypadOperator" should "know which number it is currently on" in {
    val keypadOp = KeypadOperator(5)
    keypadOp.getCurrentNumber should be (5)
  }

  "A KeypadOperator" should "be able to move left" in {
    val keypadOp = KeypadOperator(5)
    keypadOp.moveLeft
    keypadOp.getCurrentNumber should be (4)
  }

  "A KeypadOperator" should "be able to move right" in {
    val keypadOp = KeypadOperator(5)
    keypadOp.moveRight
    keypadOp.getCurrentNumber should be (6)
  }

  "A KeypadOperator" should "be able to move up" in {
    val keypadOp = KeypadOperator(5)
    keypadOp.moveUp
    keypadOp.getCurrentNumber should be (2)
  }

  "A KeypadOperator" should "be able to move down" in {
    val keypadOp = KeypadOperator(5)
    keypadOp.moveDown
    keypadOp.getCurrentNumber should be (8)
  }

  "A KeypadOperator" should "not move left from left edge" in {
    val keypadOp = KeypadOperator(4)
    keypadOp.moveLeft
    keypadOp.getCurrentNumber should be (4)
  }

  "A KeypadOperator" should "not move right from right edge" in {
    val keypadOp = KeypadOperator(9)
    keypadOp.moveRight
    keypadOp.getCurrentNumber should be (9)
  }

  "A KeypadOperator" should "not move up from top row" in {
    val keypadOp = KeypadOperator(2)
    keypadOp.moveUp
    keypadOp.getCurrentNumber should be (2)
  }

  "A KeypadOperator" should "not move down from bottom row" in {
    val keypadOp = KeypadOperator(7)
    keypadOp.moveDown
    keypadOp.getCurrentNumber should be (7)
  }
}
