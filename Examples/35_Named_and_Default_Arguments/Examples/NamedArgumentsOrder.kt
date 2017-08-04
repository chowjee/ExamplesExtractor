package namedAndDefaultArguments

import com.atomickotlin.test.eq

fun main(args: Array<String>) {
  getColor(blue = 0, red = 255, green = 255) eq "(255, 255, 0)"

  // Can't put regular argument after named one:
  // getColor(red = 255, 255, 0)
}
