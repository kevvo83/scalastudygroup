/*
  I want to write a contains method, that will return a Boolean if the value exists or not
 */

def contains[T](vector: Vector[T], e: T): Boolean =
  vector.foldLeft(false)((acc, b) => if (b == e) true else acc) // this is an O(n) where n = number of elems

@scala.annotation.tailrec
def contains1[T](seq: Seq[T], e: T): Boolean = seq match { // this is also O(n)
  case Nil => false
  case h :: t => if (h == e) true else contains1(t, e)
}

val test: Vector[Int] = Vector(1,2,3,4,5,6,7,8,9,10)
val test1: Seq[Int] = Seq(1,2,3,4,5,6,7,8,9,10)

println(contains1(test1, 10))
println(contains1(test1, 99))

/*

An explanation using manual recursive (1, 2, 3, 4, 5)

1. 1 :: (2, 3, 4, 5)
2. 2 :: (3, 4, 5)
3. 3 :: (4, 5)
4. 4 :: (5)
5. 5 :: Nil
6. Nil

 */