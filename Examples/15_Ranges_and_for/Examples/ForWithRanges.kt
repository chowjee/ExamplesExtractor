package rangesandfor

fun showRange(r: IntProgression) {
  println(r)
  for(i in r) {
    print("$i ")
  }
  println()
}

fun showCharRange(r: CharProgression) {
  println(r)
  for(i in r) {
    print("$i ")
  }
  println()
}

fun main(args: Array<String>) {
  showRange(1..10)
  showRange(0 until 10)
  showRange(0..20 step 2)
  showRange(0 until 20 step 3)
  showCharRange('a'..'d')
  showCharRange('a'..'t' step 3)
}
/* Output:
1..10
1 2 3 4 5 6 7 8 9 10
0..9
0 1 2 3 4 5 6 7 8 9
0..20 step 2
0 2 4 6 8 10 12 14 16 18 20
0..18 step 3
0 3 6 9 12 15 18
a..d
a b c d
a..s step 3
a d g j m p s
*/