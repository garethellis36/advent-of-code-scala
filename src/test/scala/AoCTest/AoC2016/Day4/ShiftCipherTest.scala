package AoCTest.AoC2016.Day4

import AoC2016.Day4.Room
import AoC2016.Day4.ShiftCipher
import org.scalatest._

class ShiftCipherTest extends FlatSpec with Matchers {

  "A cipher" should "decrypt a room with code qzmt-zixmtkozy-ivhz-343 to very encrypted name" in {

    val room = Room("qzmt-zixmtkozy-ivhz-343")
    val ShiftCipher = new ShiftCipher
    ShiftCipher.decrypt(room.getEncryptedName, 343) should be ("very encrypted name")

  }

}
