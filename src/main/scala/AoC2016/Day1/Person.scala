package AoC2016.Day1

class Person(private var location: Location, private var tracker: Tracker, private var orientation: String = "N") {
  private var orientations = List("N", "E", "S", "W")

  private var orientationIndex = orientations.indexOf(orientation)

  tracker record location

  def follow(directions: Directions) = {
    directions.toListOfTuples.foreach(t => {
      t._1 match {
        case "L" => left(t._2)
        case "R" => right(t._2)
      }
    })
    this
  }

  private def move() = {
    orientations(orientationIndex) match {
      case "N" => {
        location = Location(location.x, location.y + 1)
      }
      case "E" => {
        location = Location(location.x + 1, location.y)
      }
      case "S" => {
        location = Location(location.x, location.y - 1)
      }
      case "W" => {
        location = Location(location.x - 1, location.y)
      }
    }
    tracker record location
  }

  def left(numberOfBlocks: Int) = {
    orientationIndex -= 1
    if (orientationIndex < 0)
      orientationIndex += orientations.length

    1 to numberOfBlocks foreach(i => move)
  }

  def right(numberOfBlocks: Int) = {
    orientationIndex += 1
    if (orientationIndex > orientations.indexOf(orientations.last))
      orientationIndex -= orientations.length

    1 to numberOfBlocks foreach(i => move)
  }

  def getLocation: Location = location

  def getLocationHistory: List[Location] = tracker.getHistory
}

object Person {
  def apply(x: Int, y: Int, orientation: String = "N") = {
    new Person(Location(x, y), new Tracker, orientation)
  }
}
