package AoC2015.Day1

class Lift {

  private var currentFloor = 0

  def goUp = currentFloor += 1

  def goDown = currentFloor -= 1

  def getCurrentFloor = currentFloor
}