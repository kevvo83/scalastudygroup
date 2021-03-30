
case class Transaction(item: String, price: Double)

val listOfTxns: Seq[Transaction] = Seq(
  Transaction("soap", 20.0),
  Transaction("clearer", 10.0),
  Transaction("tootbrush", 22.1),
  Transaction("brush 1", 12.1),
  Transaction("brush 2", 28.1),
  Transaction("rbsuch2 ", 9.4),
  Transaction("sdas 1", 2.5),
  Transaction("xya", 1.9),
  Transaction("abc", 9.9),
  Transaction("qqq", 2.2),
)

import scala.math.Ordering
implicit val txnOrd: Ordering[Transaction] = new Ordering[Transaction] {
  /*
  - negative if x < y
   *  - positive if x > y
   *  - zero otherwise (if x == y)
   */
  def compare(x: Transaction, y: Transaction) = 1 match {
    case _ if x.price > y.price => 1
    case _ if x.price < y.price => -1
    case _ => 0
  }

}

listOfTxns.sorted.foreach(println)
