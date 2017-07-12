package destructuring2

import com.atomickotlin.test.eq

fun compute(input: Int): Pair<Int, String> =
    if (input > 5)
      Pair(input * 2, "High")
    else
      Pair(input * 2, "Low")

fun main(args: Array<String>) {
  val (value, description) = compute(7)
  value eq 14
  description eq "High"
}