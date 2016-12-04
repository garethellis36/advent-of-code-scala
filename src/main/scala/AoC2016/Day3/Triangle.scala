package AoC2016.Day3

class Triangle(x: Int, y: Int, z: Int) {

  def isValid = {
    x + y > z && x + z > y && y + z > x
  }

}

object Triangle {
  def apply(x: Int, y: Int, z: Int): Triangle = new Triangle(x, y, z)
}

