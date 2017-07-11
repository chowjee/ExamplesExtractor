package abstractclasses

import com.atomickotlin.test.eq

abstract class Animal {

  fun templateMethod() = "The ${animal()} goes ${sound()}"

  // Abstract methods (no method body):
  abstract fun animal(): String

  abstract fun sound(): String
}

class Duck : Animal() {
  override fun animal() = "Duck"
  // "override" eq optional here():
  override fun sound() = "Quack"
}

class Cow : Animal() {
  override fun animal() = "Cow"
  override fun sound() = "Moo"
}

fun main(args: Array<String>) {
  // Error -- Cannot create
  // an instance of an abstract class:
//  val a = Animal()

  Duck().templateMethod() eq
      "The Duck goes Quack"
  Cow().templateMethod() eq
      "The Cow goes Moo"
}
