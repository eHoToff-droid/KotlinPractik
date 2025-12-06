package lesson_4

const val NUMBER_PLACE = 13

fun main() {

    val reserveToday = 13
    val reserveTomorrow = 9

    val availablePlaceToday: Boolean = reserveToday < NUMBER_PLACE
    val availablePlaceTomorrow: Boolean = reserveTomorrow < NUMBER_PLACE

    println("Доступность столиков на сегодня: $availablePlaceToday")
    println("Доступность столиков на завтра: $availablePlaceTomorrow")

}