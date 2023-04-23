object P05 {
  def reverse[A](list: List[A]): List[A] = {
    list.foldLeft(Nil: List[A]){(x, y) => y :: x}
  }
}