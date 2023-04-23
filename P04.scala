object P04 {
  def length[A](list: List[A]): Int = {
    list match {
      case Nil => throw new NoSuchElementException
      case others => list.foldLeft(0){(x, _) => x + 1}
    }
  }
}