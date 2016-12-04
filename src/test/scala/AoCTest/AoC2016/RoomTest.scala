package AoCTest.AoC2016

import AoC2016.Day4.Room
import org.scalatest._

class RoomTest extends FlatSpec with Matchers {

  "A Room" should "have sector ID 123 with code aaaaa-bbb-z-y-x-123[abxyz]" in {

    val room = Room("aaaaa-bbb-z-y-x-123[abxyz]")
    room.getSectorId should be (123)

  }

  "A Room" should "have checksum abxyz with code aaaaa-bbb-z-y-x-123[abxyz]" in {

    val room = Room("aaaaa-bbb-z-y-x-123[abxyz]")
    room.getApparentChecksum should be ("abxyz")

  }

  "A Room" should "have encrypted name aaaaabbbzyx with code aaaaa-bbb-z-y-x-123[abxyz]" in {

    val room = Room("aaaaa-bbb-z-y-x-123[abxyz]")
    room.getEncryptedName should be ("aaaaabbbzyx")

  }

  "A Room" should "have actual checksum abxyz with code aaaaa-bbb-z-y-x-123[abxyz]" in {

    val room = Room("aaaaa-bbb-z-y-x-123[abxyz]")
    room.getActualChecksum should be ("abxyz")

  }

  "A Room" should "be a real room with code aaaaa-bbb-z-y-x-123[abxyz]" in {

    val room = Room("aaaaa-bbb-z-y-x-123[abxyz]")
    room.isRealRoom should be (true)

  }
}
