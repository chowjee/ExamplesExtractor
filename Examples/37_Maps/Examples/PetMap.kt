package maps

import com.atomickotlin.test.eq

//TODO
open class Pet(val name: String) {
  override fun toString() = name
}

open class Bird(name: String = "Bird") : Pet(name)
class Duck : Bird("Duck")
class Cat : Pet("Cat")
class Dog : Pet("Dog")

fun main(args: Array<String>) {
  val petMap = mapOf("Dick" to Bird(),
      "Carl" to Duck(), "Joe" to Cat(),
      "Tor" to Dog())

  petMap.keys eq setOf("Dick", "Carl", "Joe", "Tor")

  petMap.values eq "[Bird, Duck, Cat, Dog]"
}
