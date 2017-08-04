package operationsOnLists

import com.atomickotlin.test.eq

fun main(args: Array<String>) {
  val l = listOf(1, 10, 100, 1000)
  l.reduce { sum, n -> sum + n } eq 1111
}
