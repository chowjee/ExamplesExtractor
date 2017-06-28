package mapandreduce

import com.atomickotlin.test.eq

fun main(args: Array<String>) {
  (1..100).reduce { sum, n -> sum + n } eq
      5050
  val l2 = listOf("D", "u", "c", "k")
  l2.reduce { sum, n -> sum + n } eq "Duck"
}