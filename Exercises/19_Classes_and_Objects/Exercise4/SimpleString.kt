package classesAndObjects4

class SimpleString(private val s: String) {
    fun get(i: Int): Char = s[i]
    val length = s.length
}
