package overridingfunctions

import com.atomickotlin.test.eq

open class GreatApe {
  open fun call() = "Hoo!"
  var energy = 3
  open fun eat(): Int {
    energy += 10
    return energy
  }

  fun climb(x: Int) {
    energy -= x
  }
}

class Bonobo : GreatApe() {
  override fun call() = "Eep!"

  init {
    // Modify the base-class var:
    energy = 5
  }

  // Call the base-class version:
  override fun eat() = super.eat() * 2

  // Add a function():
  fun run() = "Bonobo run"
}

class Chimpanzee : GreatApe() {
  override fun call() = "Yawp!"
  override fun eat() = super.eat() * 3
  fun jump() = "Chimp jump"
  val kind = "Common" // New property
}

fun talk(ape: GreatApe): String {
  // ape.run()  // Not an ape function
  // ape.jump // Nor this
  ape.climb(4)
  return ape.call() + ape.eat()
}

fun main(args: Array<String>) {
  talk(GreatApe()) eq "Hoo!9"
  talk(Bonobo()) eq "Eep!22"
  talk(Chimpanzee()) eq "Yawp!27"
}