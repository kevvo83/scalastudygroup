import scala.math.pow

val globallySetConditionVariable = 2

// what is a Pure Function?
val Y: Int => Int = (x: Int) => x * 20

// What is another Impure function
val Y: Int => Int = (x: Int) => {
  print("hello")
  x * 20
}

// what is an Impure Function
val Z: Int => Int = (x: Int) => x * 20 + globallySetConditionVariable // the response doesn't only depend on input parameters

// Partial Function
// A Function that evaluates only to a set out of the possible range of values
val PF1 = new PartialFunction[Int, Float] {
  def apply(a: Int) = 10.0f / a
  override def isDefinedAt(x: Int): Boolean = x != 0
}

val PF2 = new PartialFunction[Float, Float] {
  def apply(b: Float) = 20.0f / b
  def isDefinedAt(x: Float): Boolean = x != 0
}

val chainedPf = PF1.andThen(PF2)

// Partial Functions composition compose, andThen, ifElse

// Function currying - an introduction


// Map - passing anonymous function
List(2,3,4,5,6) map ((a: Int) => a * 2)

// FlatMap
List(3, 10, 8, 2, 20, 0) map (PF1(_))


// Scala Unextractor - unapply - types of unapply - normal unapply + other types


// Polymorphic function
def PYF[A](a: List[A], valueToBeFound: A): List[A] = {
  a filter (_ == valueToBeFound)
}

def mean(xs: Seq[Double]): Option[Double] =
  if (xs.isEmpty) None
  else Some(xs.sum / xs.length)

def variance(xs: Seq[Double]): Option[Double] =
  mean(xs).flatMap(mean_value => mean(xs.map(elem => pow(elem - mean_value, 2.0))))


