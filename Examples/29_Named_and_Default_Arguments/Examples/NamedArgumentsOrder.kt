package namedanddefault2

class Color(red: Int, blue: Int, green: Int)

fun main(args: Array<String>) {
  Color(green = 100, red = 80, blue = 9)
}