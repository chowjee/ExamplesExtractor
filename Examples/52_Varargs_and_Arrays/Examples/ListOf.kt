package varargs

import com.atomickotlin.test.eq

fun main(args: Array<String>) {
  listOf(1) eq "[1]"
  listOf("a", "b") eq "[a, b]"
}
