package rangesandfor

fun inRange(n: Int, r: IntProgression) =
  println("$n in $r? ${n in r}")

fun testRange(r: IntProgression) {
  inRange(0, r)
  inRange(1, r)
  inRange(9, r)
  inRange(10, r)
  inRange(18, r)
  inRange(19, r)
}

fun main(args: Array<String>) {
  testRange(1..10)
  testRange(0 until 10)
  testRange(0..20 step 2)
  testRange(0 until 20 step 3)
}
/* Output:
0 in 1..10? false
1 in 1..10? true
9 in 1..10? true
10 in 1..10? true
18 in 1..10? false
19 in 1..10? false
0 in 0..9? true
1 in 0..9? true
9 in 0..9? true
10 in 0..9? false
18 in 0..9? false
19 in 0..9? false
0 in 0..20 step 2? true
1 in 0..20 step 2? false
9 in 0..20 step 2? false
10 in 0..20 step 2? true
18 in 0..20 step 2? true
19 in 0..20 step 2? false
0 in 0..18 step 3? true
1 in 0..18 step 3? false
9 in 0..18 step 3? true
10 in 0..18 step 3? false
18 in 0..18 step 3? true
19 in 0..18 step 3? false
*/