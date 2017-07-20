package localfunctions

import com.atomickotlin.test.eq

fun main(args: Array<String>) {

  fun String.exclaim() = "$this!"

  "Hello".exclaim() eq "Hello!"
  "Hallo".exclaim() eq "Hallo!"
  "Привет".exclaim() eq "Привет!"
  "你好".exclaim() eq "你好!"
}