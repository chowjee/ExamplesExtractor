package namedanddefault1

class Color(red: Int, blue: Int, green: Int)

fun main(args: Array<String>) {
  Color(red = 80, blue = 9, green = 100)
  Color(80, 9, green = 100)
}