/*

Set -1

  How to write function
    Return function as value
    Take function as value
  trait
    sealed trait
  Class & Companion object
    apply method
    unapply method
  Implicits

*/


// Exercise 1
def outsideFunctionDeprecated(in: Seq[Int]): Seq[Int] = {
  import math.pow
  def opFunc(a: Int) = pow(a, 2.0).toInt

  in.map(opFunc(_))
}

def outsideFunction(in: Seq[Int], opFunc: Int => Int): Seq[Int] = in.map(opFunc)

// Exercise 2 - write a function that returns another function
def example2Func(in: Int) = (v: Int) => in + v

// Exercise 3 - Function Currying - using Option.getOrElse
def getOrElse(opt: Option[Int])(default: Int): Option[Int] = ???

// syntax for a function def
def multiply2(in: Int): Int = in * 2

// val def functions - everything after the = sign is the syntax for anonymous functions
val f2 = (in: Int) => in * 3


def getOrElse2(opt: Option[Int]): Option[Int] = opt match {
  case None => None
  case Some(x) => Some(x + 1)
}




