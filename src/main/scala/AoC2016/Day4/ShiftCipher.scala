package AoC2016.Day4

class ShiftCipher {

  private val zAsint = 'z'.toInt

  def decrypt(encrypted: String, rotations: Int) = {

    encrypted.map(ch => {

      if (ch == '-')
        ' '
      else
        rotateChar(ch, rotations)
    })

  }

  private def rotateChar(ch: Char, rotations: Int) = {
      val actualRotations = rotations % 26
      if (actualRotations == 0)
        ch
      else {
        var char = ch
        1 to actualRotations foreach(i => {
          char = rotateOnce(char)
        })
        char
      }
  }

  private def rotateOnce(ch: Char) = {
    if (ch.toInt == zAsint)
      'a'
    else
      ch.toInt.+(1).toChar
  }
}
