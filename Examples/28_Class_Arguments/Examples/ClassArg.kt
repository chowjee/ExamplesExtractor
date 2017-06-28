package classarguments1

import com.atomickotlin.test.eq

class ClassArg(a: Int) {
  init {
    println("a = " + a)
  }

  val f = a * 10
}

fun main(args: Array<String>) {
  val ca = ClassArg(19)
  ca.f eq 190
//  ca.a // error
}