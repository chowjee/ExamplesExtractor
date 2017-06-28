package classarguments3

import com.atomickotlin.test.eq

class Sum3(val a1: Int, val a2: Int, val a3: Int) {
  fun result(): Int = a1 + a2 + a3
}

fun main(args: Array<String>) {
  Sum3(13, 27, 44).result() eq 84
}