package namedanddefault4

class Family(vararg kids: String, mom: String, dad: String)

fun main(args: Array<String>) {
  Family("Harry", mom = "Mom", dad = "Dad")
}