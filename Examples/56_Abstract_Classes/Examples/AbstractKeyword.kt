package abstractclasses

abstract class WithValVar {
  abstract val x: Int
  abstract var y: Int
}

abstract class WithMethod {
  abstract fun f(): Int
  abstract fun g(n: Double)
}
