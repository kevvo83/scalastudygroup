// Option, Try
// Either - Left/Right

// implicit val num: Numeric[Int] =

import scala.util._

// Example 1. Option
// Functional Totality - here the signature returns as advertised
def computeMeanOfList(in: List[Int]): Option[Double] = in match {
  case Nil => None
  case _ => Some(in.sum / in.length)
}


// Example 2. Either + Exceptions
def computeMeanOfList2(in: List[Int]): Either[Throwable, Double] = {
  Try(in.sum / in.length).map(_.toDouble).toEither
}


def computeMeanOfList3(in: List[Int]) = {
  if (in.isEmpty) Left(new Throwable)
  else Right(in.sum / in.length)
}



// doobie is a small/lightweight jdbc wrapper
// real-life use case of Either - user auth - taken token and return User - Either[Throwable, User]
/*
  authenticate(cred).flatMap(x => x.getProfile(x.user_name)).flatMap()

  def authenticate: Either
  def getProfile: Either

  for {
    u <- authenticate(cred)
    g <- getProfile(u.user_name)
  } yield g
 */


// Set 1 -
// Set 2 - Option/Either
// Set 3 - Collections
// Set 4 - Futures - i need to read this


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

Set - 2
Option , Either , Try
Why and when to use these ?
Use of flat map, map , foreach & pattern matching on them
Future
Map , flatmap, error handling
Data processing

Set -3
Seq, List, Map
How to create
add, remove, merge, split , travel methods on these

Set -4
Function totality
Error as a Data
Separate data and behavior

That's it your are the master of Scala
 */

// http://aperiodic.net/phil/scala/s-99/



// Option Lifting



// tests
val ipl = List(1,2,3,4,5)
println(s"Example 1 result: ${computeMeanOfList(ipl)}")

val res = computeMeanOfList2(ipl) match {
  case Left(th) => s"Exception encountered $th"
    case Right(mean) => s"Mean of list $ipl is $mean"
}
println(s"Example 2 result: $res")


// Revision
