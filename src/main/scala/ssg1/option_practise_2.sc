/*
  From the Red Book Exercise 4.3

  Write a generic function map2 that combines two Option values using a binary function.
  If either Option value is None, then the return value is too. Here is its signature:

  def map2[A,B,C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C]
 */

def map2[A,B,C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C] = ???


/*
  From the Red Book Exercise 4.3

  Write a function sequence that combines a list of Options into one Option containing a list of all
  the Some values in the original list.

  If the original list contains None even once, the result of the function should be None;
  otherwise the result should be Some with a list of all the values.

  Here is its signature:

  def sequence[A](a: List[Option[A]]): Option[List[A]]
 */

def sequence[A](a: List[Option[A]]): Option[List[A]] = {

  def worker(in: List[Option[A]], acc: Option[List[A]]): Option[List[A]] = in match {
    case (h: Option[A]) :: (t: List[Option[A]]) => h match {
      case None => None
      case Some(Nil) => acc
      case _ => worker(t, Some(h.orNull :: acc.getOrElse(List())))
    }
  }

  worker(a, Some(List()))
}