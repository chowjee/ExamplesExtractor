package sets

import com.atomickotlin.test.eq

fun main(args: Array<String>) {
  val set = mutableSetOf<Int>()
  set += 42
  set += 42
  set eq setOf(42)
}
