case class Car(brand: String, costPrice: Double)
case class Inventory(inventory: Seq[Car])

var sampleInventory: Inventory = Inventory(
  Seq(
    Car("Honda", 10.0),
    Car("Suzuki", 21.1),
    Car("BMW", 19.1),
    Car("Mercedes", 29.1),
    Car("Toyota", 10.1),
    Car("Tesla", 9.1)
  )
)

import scala.math.Ordering

val carSorter: Ordering[Car] = new Ordering[Car] {

  /** Returns an integer whose sign communicates how x compares to y.
   *
   * The result sign has the following meaning:
   *
   *  - negative if x < y
   *  - positive if x > y
   *  - zero otherwise (if x == y)
   */
  def compare(x: Car, y: Car): Int =
    if (x.costPrice < y.costPrice) -1
    else if (x.costPrice > y.costPrice) 1
    else 0
}

def sortInventory(in: Inventory): Inventory = Inventory(in.inventory.sorted(carSorter))

val result: Inventory = sortInventory(sampleInventory)
result.inventory.foreach(print(_))