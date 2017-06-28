package classarguments

import com.atomickotlin.test.eq

class Sum(vararg val args: Int) {
  fun result(): Int {
    var total = 0
    for (n in args) {
      total += n
    }
    return total
  }
}

fun main(args: Array<String>) {
  Sum(13, 27, 44).result() eq 84
  Sum(1, 3, 5, 7, 9, 11).result() eq 36
}