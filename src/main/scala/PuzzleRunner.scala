import java.io.FileNotFoundException

import scala.io.Source

object PuzzleRunner extends App {

  val year = parseOption("year")
  val day = parseOption("day")
  val puzzle = parseOption("puzzle")

  if (day == -1 || puzzle == -1 || year == -1)
    help

  else
    run(year, day, puzzle)

  def run(year: Int, day: Int, puzzle: Int): Unit = {

    println("Running AOC puzzle " + year + " day " + day + " puzzle " + puzzle + "...")

    val inputFile = getInputFile(year, day, puzzle)

    if (year == 2015 && day == 1 && puzzle == 1)
      AoC2015.Day1.Puzzle1(inputFile)
    else if (year == 2016 && day == 1 && puzzle == 1)
      AoC2016.Day1.Puzzle1(inputFile)
    else if (year == 2016 && day == 1 && puzzle == 2)
      AoC2016.Day1.Puzzle2(inputFile)
    else if (year == 2016 && day == 2 && puzzle == 1)
      AoC2016.Day2.Puzzle1(inputFile)
    else if (year == 2016 && day == 2 && puzzle == 2)
      AoC2016.Day2.Puzzle2(inputFile)

    else if (year == 2016 && day == 3 && puzzle == 1)
      AoC2016.Day3.Puzzle1(inputFile)

    else if (year == 2016 && day == 3 && puzzle == 2)
      AoC2016.Day3.Puzzle2(inputFile)

    else if (year == 2016 && day == 4 && puzzle == 1)
      AoC2016.Day4.Puzzle1(inputFile)

    else if (year == 2016 && day == 4 && puzzle == 2)
      AoC2016.Day4.Puzzle2(inputFile)

    else
      println("Puzzle not found")
  }

  def getInputFile(year: Int, day: Int, puzzle: Int): Source = {
    try {
      val PATH = getClass.getResource("").getPath
      Source.fromFile(PATH + "/" + year + "/day" + day)
    } catch {
      case e: FileNotFoundException => {
        println("No input file found...")
        new NullSource
      }
    }
  }

  def help = println("Usage: scala runner.scala year:<int> day:<int> puzzle:int>")

  def parseOption(option: String): Int = {

    //check if there's an option in the form <option>:<number>
    val matchingOptions = args.filter(arg => arg.matches("^" + option + ":[0-9]+$"))

    if (matchingOptions.isEmpty)
      defaultOption(option)

    else
      matchingOptions.head.split(":").apply(1).toInt

  }

  def defaultOption(option: String): Int = {
    option match {
      case "year" => 2016
      case "day" => -1
      case "puzzle" => -1
    }
  }
}
