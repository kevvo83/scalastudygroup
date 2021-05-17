/*
  A Pure function is one whose output is purely a function of its input.

  No Side-effects

  A Pure function is Referentially Transparent - i.e. if a function f exists in a program P, and:
  y = f(x)

  The function f is RT (i.e. Referentially Transparent) if:
  P(f(x)) == P(y)

  That is to say, that the effect on P of evaluating f(x) == is the effect on P of P just calling y

  The idea of RT is just FYI at this point

  [Side effects reference examples (https://stackoverflow.com/questions/65856527/what-is-a-side-effect-in-scala)]
*/

// Simple examples of Pure Functions
def iterateNumberByOne(x: Int): Int = x + 1 // you don't need to provide a return statement - the last line in the function def is the returned object
def squareANumber(x: Int): Int = x ^ 2

// Pure Functions involving Collections
def returnFirstElementInList(in: List[Int]): Int = in.head
def returnSumOfElementsInList(in: List[Int]): Int = in.reduce((a, b) => a + b) // reduce is a Collection method - will follow

// Functions in Scala can be assigned to a Variable
val Y: Int => Int = (x: Int) => x * 20
val A: (Int, Int) => Double = (a: Int, b: Int) => (a + b).toDouble

// Simple examples of Impure Functions
val globallySetConditionVariable = 2

def impureFuncExample1 (a: Int): Int = { // A function whose input doesn't completely depend on the input parameters
  a * 20 + globallySetConditionVariable
}
val impureFuncExample2: Int => Int = (x: Int) => x * 20 + globallySetConditionVariable // same as above def

val Y1: Int => Int = (x: Int) => {
  print("hello")
  x * 20
}



// Anonymous functions are functions that don't have a name, here is an example with syntax
(a: Int) => a * 100

List(1 ,2 , 3).map(a => a * 2) // Anonymous functions are passed to other functions mostly - especially when using Collections



/*
  Exercises
 */