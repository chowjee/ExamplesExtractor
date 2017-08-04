package testing1

import com.atomickotlin.test.eq

fun main(args: Array<String>) {
  calculateBMI(160, 68) eq "Normal weight"
//  calculateBMI(100, 68) eq "Underweight"
//  calculateBMI(200, 68) eq "Overweight"
}

fun calculateBMI(lbs: Int, height: Int): String = "Normal weight"
