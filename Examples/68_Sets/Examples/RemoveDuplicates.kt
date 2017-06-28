package sets

import com.atomickotlin.test.eq

fun main(args: Array<String>) {
  val ch = (0..2).map { 'a'..'d' }.toList()
  ch eq "[a..d, a..d, a..d]"

  ch.flatten() eq "[a, b, c, d, " +
      "a, b, c, d, a, b, c, d]"

  ch.flatten().toSet() eq "[a, b, c, d]"
}