package AoC2016.Day1

class Tracker {

  private var history: List[Location] = List[Location]()

  def record(location: Location) = {
    history = location :: history
  }

  def getHistory: List[Location] = history.reverse

}
