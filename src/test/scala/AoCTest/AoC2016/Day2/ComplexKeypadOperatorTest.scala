package AoCTest.AoC2016.Day2

import AoC2016.Day2.ComplexKeypadOperator
import org.scalatest._

class ComplexKeypadOperatorTest extends FlatSpec with Matchers {

  "A ComplexKeypadOperator" should "not move left from 5" in {
    val cpo = ComplexKeypadOperator('5')
    cpo.moveLeft
    cpo.getCurrentKey should be ('5')
  }

  "A ComplexKeypadOperator" should "not move up from 5" in {
    val cpo = ComplexKeypadOperator('5')
    cpo.moveUp
    cpo.getCurrentKey should be ('5')
  }

  "A ComplexKeypadOperator" should "not move down from 5" in {
    val cpo = ComplexKeypadOperator('5')
    cpo.moveDown
    cpo.getCurrentKey should be ('5')
  }

  "A ComplexKeypadOperator" should "move right from 5" in {
    val cpo = ComplexKeypadOperator('5')
    cpo.moveRight
    cpo.getCurrentKey should be ('6')
  }

  "A ComplexKeypadOperator" should "not move up from 1" in {
    val cpo = ComplexKeypadOperator('1')
    cpo.moveUp
    cpo.getCurrentKey should be ('1')
  }

  "A ComplexKeypadOperator" should "not move right from 1" in {
    val cpo = ComplexKeypadOperator('1')
    cpo.moveRight
    cpo.getCurrentKey should be ('1')
  }

  "A ComplexKeypadOperator" should "not move left from 1" in {
    val cpo = ComplexKeypadOperator('1')
    cpo.moveLeft
    cpo.getCurrentKey should be ('1')
  }

  "A ComplexKeypadOperator" should "move down from 1" in {
    val cpo = ComplexKeypadOperator('1')
    cpo.moveDown
    cpo.getCurrentKey should be ('3')
  }

}
