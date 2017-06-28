package namedanddefault5

class Family2(mom: String, dad: String, vararg kids: String)

fun main(args: Array<String>) {
  // this works:
  Family2("Mom", "Dad", "Sammy", "Bobby")

  // this doesn't work:
//  Family2(mom = "Mom", dad = "Dad", "Sammy", "Bobby")

  // this works:
  Family2(mom = "Mom", dad = "Dad",
      kids = *arrayOf("Sammy", "Bobby"))
}