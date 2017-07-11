package lambdas

import com.atomickotlin.test.eq

fun main(args: Array<String>) {
  var s = ""
  val duck = "Duck"
  duck.forEach { n -> s = s + n + ":" }
  s eq "D:u:c:k:"
}
