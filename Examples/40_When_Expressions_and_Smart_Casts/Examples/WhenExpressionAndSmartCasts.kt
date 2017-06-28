package whenexpressionscasts1

import com.atomickotlin.test.eq

fun acceptAnything(x: Any): String =
    when (x) {
      is String -> "A String: $x of length ${x.length}"
      is Int -> if (x < 20) "An Int Less than 20: $x" else "Some Other Int: $x"
      is Person -> "A person ${x.name}"
      else -> "I don't know what that is!"
    }

data class Person(val name: String)

fun main(args: Array<String>) {
  acceptAnything(5) eq
      "An Int Less than 20: 5"
  acceptAnything(25) eq "Some Other Int: 25"
  acceptAnything("Some text") eq
      "A String: Some text of length 9"

  val bob = Person("Bob")
  acceptAnything(bob) eq "A person Bob"
  acceptAnything(listOf(1, 2, 5)) eq
      "I don't know what that is!"
}