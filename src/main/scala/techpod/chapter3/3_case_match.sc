/*
  match, case - simple one here
 */

val checkEvenNumber = (x: Int) => x match {
  case _ > 100 => true
  case _ => false
}

def checkOddNumber(x: Int): Boolean = x match {
  case _ > 100 => true
  case _ => false
}