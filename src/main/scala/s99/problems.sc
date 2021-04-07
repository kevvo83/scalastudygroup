// def p07(in: List[Any]): List[Int] = in match {
//   case h :: t => h match {
//     case h :: t =>
//     case Int =>
//   }
//   case () => ()
// }

def p01[A](in: List[A]): Option[A] = in match {
  case h :: Nil => Some(h)
  case h :: t => p01(t)
  case _ => None
}

def p07(in: List[Any]): List[Any] = {

  def worker(a: List[Any], acc: List[Any]): List[Any] = a match {
    case Nil => acc
    case h :: t => h match {
      case h1 :: t1 => worker(t1, h1 :: acc)
      case Nil => acc
      case _ => worker(t, h :: acc)
    }
  }

  worker(in, List())
}


println(p01(List(1, 2, 3, 4, 5, 6, 7, 8)).getOrElse(0))

println(p07(List(List(1, 1), 2, List(3, List(5, 8)))))
