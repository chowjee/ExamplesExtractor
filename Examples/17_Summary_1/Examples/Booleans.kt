package summary3

fun main(args: Array<String>) {
  val hour = 6
  val opens = 9
  val closes = 20
  println("Operating hours: $opens - $closes")
  val isOpen = hour >= opens && hour <= closes
  println(isOpen)  // false
  println(!isOpen)  // true

  val isClosed = hour < opens || hour > closes
  println(isClosed)  // true
}