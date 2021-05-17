/*
  Hello world example - look at Function definition style and syntax

  Feel free to follow along with this section on Scastie
 */

// first example - what follows after : is the function return type - Unit is equivalent to void
def helloWorld(): Unit = {
  println("Hello World, welcome to the ...")
}

// Parentesis are optional
def helloWorld(myName: String): Unit = println(s"Hello World!, my name is ${myName}")

// Functions in Scala can be assigned to variables
val helloWorld: String => Unit = (myName: String) => println(s"Hello World!, my name is ${myName}")

// Function Currying  - include examples

// Parameters with default values
def helloWorld2(myName: String = "Sumit"): Unit = println(s"Hello World!, my name is ${myName}")


// Functions of type scala.Function1, scala.Function2, etc.
var x = () => println("Hello")
x match {
  case _: Function1[_, Unit] => x
}
