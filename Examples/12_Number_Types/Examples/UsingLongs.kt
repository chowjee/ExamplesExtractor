package numbertypes

fun main(args: Array<String>) {
  val i: Long = 0L + Int.MAX_VALUE // [1]
  println(i + i)
  println(1_000_000 * 1_000_000L)  // [2]
}
/* Output:
4294967294
1000000000000
*/