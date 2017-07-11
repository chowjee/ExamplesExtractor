package varargs

import com.atomickotlin.test.eq

fun main(args: Array<String>) {
   val array = intArrayOf(4, 5)
   sum(1, 2, 3, *array, 6) eq 21

   // doesn't compile:
   // sum(1, 2, 3, array, 6)
}