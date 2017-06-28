package namedanddefault3

class Color2(red: Int = 100,
             blue: Int = 100, green: Int = 100)

fun main(args: Array<String>) {
  Color2(20)
  Color2(20, 17)
  Color2(blue = 20)
  Color2(red = 11, green = 42)
}