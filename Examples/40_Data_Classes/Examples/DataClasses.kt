package dataclasses
import com.atomickotlin.test.eq
import com.atomickotlin.test.neq

data class Contact(val name: String, val number: String)

class Person(val name: String)

fun main(args: Array<String>) {
  Contact("Miffy", "1-234-567890") eq
      Contact("Miffy", "1-234-567890")

  // These two instances are not equal:
  Person("Cleo") neq Person("Cleo")

  Contact("Miffy", "1-234-567890").toString() eq
      "Contact(name=Miffy, number=1-234-567890)"
}
