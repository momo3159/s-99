object P07 {
//   def flatten(list: List[Any]): List[Any] = {
//     list match {
//       case x :: xs if x.isInstanceOf[List[Any]] => flatten(x.asInstanceOf[List[Any]]) ++ flatten(xs)
//       case x :: xs => x :: flatten(xs)
//       case Nil => Nil
//     }
//   } 

  def flatten(list: List[Any]): List[Any] = {
    // これはもしや部分関数では？
    list.flatMap {
      case xs: List[_] => flatten(xs)
      case x => List(x) 
    }
  }
}