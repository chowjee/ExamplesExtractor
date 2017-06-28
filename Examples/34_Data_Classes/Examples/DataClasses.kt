package dataclasses1

import com.atomickotlin.test.eq

data class Contact(val name: String, val number: String)

class Person(val name: String)

fun main(args: Array<String>) {
  Contact("Miffy", "1-234-567890") eq
      Contact("Miffy", "1-234-567890")

  // these two instances are not equal:
//  Person("Cleo") eq Person("Cleo")

  Contact("Miffy", "1-234-567890").toString() eq
      "Contact(name=Miffy, number=1-234-567890)"
}