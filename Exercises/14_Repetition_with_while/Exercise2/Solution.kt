package repetitionWithWhile2

fun sumOfEven(n: Int): Int {
  /*<taskWindow>*/var result = 0
  var i = 0
  while (i <= n) {
    if (i % 2 == 0) {
      result += i
    }
    i++
  }
  return result/*</taskWindow>*/
}
