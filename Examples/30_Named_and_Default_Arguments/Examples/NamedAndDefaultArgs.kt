package namedanddefault1

import com.atomickotlin.test.eq

fun getColor(
    red: Int = 0,
    green: Int = 0,
    blue: Int = 0
) =
    "($red, $green, $blue)"

fun main(args: Array<String>) {
  val darkRed = "(139, 0, 0)"
  val darkBlue = "(0, 0, 139)"
  val orange = "(255, 165, 0)"
  val purple = "(128, 0, 128)"
  
  getColor(139) eq darkRed
  getColor(blue = 139) eq darkBlue
  getColor(255, 165) eq orange
  getColor(red = 128, blue = 128) eq purple
}