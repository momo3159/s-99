object P08 {
  // def compress[A](list: List[A]): List[A] = {
  //   list match {
  //     case x1 :: x2 :: xs if x1 == x2 => compress(x2 :: xs)
  //     case x1 :: x2 :: xs => x1 :: compress(x2 :: xs)
  //     case x1 :: Nil => x1 :: Nil
  //     case _ => Nil
  //   }
  // }

  def compress[A](list: List[A]): List[A] = {
    list match {
      case head :: next => head :: compress(next.dropWhile(_ == head))
      case _ => Nil
    }
  }
}
