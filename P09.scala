object P09 {
  def pack[A](list: List[A]): List[List[A]] = {
    list match {
      case x :: xs => x :: xs.takeWhile(_ == x) ++ pack(xs.dropWhile(_ == x))
      case _ => Nil
    }
  }
}