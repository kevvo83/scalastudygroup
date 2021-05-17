/*
  A higher-order function is a function that takes another function as an argument. The use of higher-order functions
  is very commonly found style in Functional Programming.

  Two major examples of the use of higher-order functions are:
  1. When using map(), flatMap(), foldLeft(), etc. on Collections
  2. When generalizing functions
 */

val in: List[Int] = List(10, 22, 44, 28, 299, 11)

// An Example of Point #1 above - i.e. when using map(), etc. with Collections

// How to double each element in a List
val out = in.map(x => x * 2)
out.foreach(x => println(x))


// An Example of Point #2 above - i.e. How to generalise Functions

// Problem Statement: A function that checks that the sum of 2 numbers meets a criteria
def checkThatSumOf2NumbersIsGreaterThan100(a: Int, b: Int): Boolean = (a + b) match {
  case _ > 100 => true
  case _ => false
}

def checkThatSumOf2NumbersIsLessThan100(a: Int, b: Int): Boolean = (a + b) match {
  case _ < 100 => true
  case _ => false
}

def checkThatSumOf2NumbersMeetsAProperty(a: Int, b: Int)(f: Int => Boolean): Boolean = f(a + b)