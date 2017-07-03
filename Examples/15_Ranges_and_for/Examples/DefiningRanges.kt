package rangesandfor

fun main(args: Array<String>) {
  val range1 = 1..10             // [1]
  val range2 = 0 until 10        // [2]
  val range3 = 0..20 step 2      // [3]
  val range4 = 0 until 20 step 3 // [4]
  val range5 = 9 downTo 2 step 3 // [5]
  val range6 = 'a'..'d'          // [6]
  val range7 = 'a'..'t' step 3   // [7]
  println(range1)
  println(range2)
  println(range3)
  println(range4)
  println(range5)
  println(range1.reversed())     // [8]
  println(range6)
  println(range7)
}
/* Output:
1..10
0..9
0..20 step 2
0..18 step 3
9 downTo 3 step 3
10 downTo 1 step 1
a..d
a..s step 3
*/