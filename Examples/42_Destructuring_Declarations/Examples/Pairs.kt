package destructuring1

import com.atomickotlin.test.eq

fun compute(input: Int) =
    if (input > 5)
      Pair(input * 2, "High")
    else
      Pair(input * 2, "Low")

fun main(args: Array<String>) {
  compute(7) eq Pair(14, "High")
  compute(4) eq Pair(8, "Low")

  val result = compute(5)
  result.first eq 10
  result.second eq "Low"
}