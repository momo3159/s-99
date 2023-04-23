import P09.pack

object P10 {
  def List[A](list: List[A]): List[(Int, A)] = {
    pack(list).map(x => (x.length, x.head))
  }
}