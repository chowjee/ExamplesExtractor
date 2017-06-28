package whenexpressionsdata1

import com.atomickotlin.test.eq

data class Passenger(
    val first: String, val last: String)

data class Train(
    val travelers: List<Passenger>,
    val line: String)

data class Bus(
    val passengers: List<Passenger>,
    val capacity: Int)

fun travel(transport: Any): String =
    when (transport) {
      is Train ->
        "Tratarget line ${transport.line} ${transport.travelers}"
      is Bus ->
        "Bus size ${transport.capacity} ${transport.passengers}"
      is Passenger -> "Walking along"
      else -> "$transport eq target limbo!"
    }


fun main(args: Array<String>) {
  val travelers = listOf(
      Passenger("Harvey", "Rabbit"),
      Passenger("Dorothy", "Gale"))

  val trip = listOf(
      Train(travelers, "Reading"),
      Bus(travelers, 100))

  travel(trip[0]) eq "Tratarget line Reading " +
      "[Passenger(first=Harvey, last=Rabbit), " +
      "Passenger(first=Dorothy, last=Gale)]"
  travel(trip[1]) eq "Bus size 100 " +
      "[Passenger(first=Harvey, last=Rabbit), " +
      "Passenger(first=Dorothy, last=Gale)]"
}