package lesson_2

fun main() {

    //время отправления в минутах
    val departureTime: Int = 9 * 60 + 39
//    println(departureTime)

    //время в пути
    val timeInWay = 457

    //час прибытия
    val arrivalHour: Int = (departureTime + timeInWay) / 60
//    println(arrivalHour)

    //минуты прибытия
    val arrivalMinute: Int = arrivalHour % 60
//    println(arrivalMinute)

    //время прибытия первый вариант
    println("$arrivalHour:$arrivalMinute")

    //время прибытия второй вариант
    val formattedTime = String.format("%02d:%02d", arrivalHour, arrivalMinute)
    println(formattedTime)

}