package colorblend

import com.atomickotlin.test.eq
import paintcolors.Color.*

fun main(args: Array<String>) {
  blend(red, yellow) eq orange
  blend(red, red) eq red
  blend(yellow, blue) eq green
  blend(purple, orange) eq blue
  blend(purple, brown) eq brown
}