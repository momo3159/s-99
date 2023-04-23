object P01 {
  def last[A](list: List[A]): A = {
    list.reverse match {
      case Nil => throw new IllegalArgumentException("Nil is invalid")
      case x :: xs => x
    }
  }

  // def last[A](list: List[A]): A = {
  //   list match {
  //     case x :: Nil => x
  //     case x :: xs => last(xs)
  //     case _ => throw new IllegalArgumentException("Nil is invalid")
  //   }
  // }

}