package testing

import com.atomickotlin.test.eq

fun main(args: Array<String>) {
  val v1 = 11
  val v2 = "a String"

  // "Short" syntax for test expressions:
  v1 eq 11
  v2 eq "a String"

  // AssertionError: Expected <Produces Error>, actual <a String>
//  v2 eq "Produces Error"
}
