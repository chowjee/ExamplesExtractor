package ifexpressions

fun trueOrFalse(exp: Boolean): String {
  if (exp) {
    return "It's true!" // [1]
  }
  return "It's false"
}

fun main(args: Array<String>) {
  val b = 1
  println(trueOrFalse(b < 3))
  println(trueOrFalse(b >= 3))
}