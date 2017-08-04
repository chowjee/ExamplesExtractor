package localFunctions

import com.atomickotlin.test.eq

fun main(args: Array<String>) {

  fun String.exclaim() = "$this!"

  "Hello".exclaim() eq "Hello!"
  "Hallo".exclaim() eq "Hallo!"
  "Bonjour".exclaim() eq "Bonjour!"
  "Ciao".exclaim() eq "Ciao!"
}
