package moreaboutranges

fun main(args: Array<String>) {
  val r = 1.0..10.0
  fun inFloatRange(n: Double) = // [1]
      println("$n in $r? ${n in r}")
  inFloatRange(0.999999)
  inFloatRange(5.0)
  inFloatRange(10.0)
  inFloatRange(10.0000001)
}
/* Output:
0.999999 in 1.0..10.0? false
5.0 in 1.0..10.0? true
10.0 in 1.0..10.0? true
10.0000001 in 1.0..10.0? false
*/