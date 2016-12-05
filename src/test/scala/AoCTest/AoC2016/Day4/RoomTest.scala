package AoCTest.AoC2016.Day4

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

  "A Room" should "have encrypted name aaaaa-bbb-z-y-x with code aaaaa-bbb-z-y-x-123[abxyz]" in {
    val room = Room("aaaaa-bbb-z-y-x-123[abxyz]")
    room.getEncryptedName should be ("aaaaa-bbb-z-y-x")
  }

  "A Room" should "have actual checksum abxyz with code aaaaa-bbb-z-y-x-123[abxyz]" in {
    val room = Room("aaaaa-bbb-z-y-x-123[abxyz]")
    room.getActualChecksum should be ("abxyz")
  }

  "A Room" should "be a real room with code aaaaa-bbb-z-y-x-123[abxyz]" in {
    val room = Room("aaaaa-bbb-z-y-x-123[abxyz]")
    room.isRealRoom should be (true)
  }

  "A Room" should "be a real room with code a-b-c-d-e-f-g-h-987[abcde]" in {
    Room("a-b-c-d-e-f-g-h-987[abcde]").isRealRoom should be (true)
  }

  "A Room" should "have actual checksum of abcde with code a-b-c-d-e-f-g-h-987[abcde]" in {
    Room("a-b-c-d-e-f-g-h-987[abcde]").getActualChecksum should be ("abcde")
  }
}
