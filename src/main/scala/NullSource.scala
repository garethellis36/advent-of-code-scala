import scala.io.Source

class NullSource extends Source {
  override protected val iter: Iterator[Char] = Iterator()
}
