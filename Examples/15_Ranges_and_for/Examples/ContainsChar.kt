package rangesandfor

fun containsChar(s: String, ch: Char): Boolean {
  for(c in s) {
    if (c == ch)
      return true
  }
  return false
}

fun main(args: Array<String>) {
  println(containsChar("kotlin", 't'))
  println('t' in "kotlin")
  println(containsChar("kotlin", 'a'))
  println('a' in "kotlin")
}
/* Output:
true
true
false
false
*/