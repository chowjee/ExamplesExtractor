package destructuring3

import com.atomickotlin.test.eq

data class ComputationResult(val data: Int, val info: String)

fun compute(input: Int) =
    if (input > 5)
      ComputationResult(input * 2, "High")
    else
      ComputationResult(input * 2, "Low")

fun main(args: Array<String>) {
  val (value, description) = compute(7)
  value eq 14
  description eq "High"
}
