package expressionsandstatements

// Can't do this:
// fun f() = for (i in 1..10) {}
// Compiler error message:
// for is not an expression, and
// only expressions are allowed here

fun g() = Unit

fun main(args: Array<String>) {
  g()
}