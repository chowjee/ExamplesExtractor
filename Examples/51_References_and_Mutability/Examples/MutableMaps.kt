package referencesmutability

import com.atomickotlin.test.eq

fun main(args: Array<String>) {
  val m = mutableMapOf(5 to "five", 6 to "six")
  m[5] eq "five"
  m[5] = "5ive"
  m[5] eq "5ive"
  m += 4 to "four"
  m eq mapOf(5 to "5ive", 4 to "four", 6 to "six")
  // Can't reassign val m:
//  m = m + (3 to "three")
}
