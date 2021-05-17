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