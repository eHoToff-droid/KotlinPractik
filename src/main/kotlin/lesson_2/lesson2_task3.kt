package lesson_2

const val TO_MIN = 60

fun main() {

    val departTimeHour: Int = 9
    val departTimeMin: Int = 37
    val timeInWay = 457

    val arrivalHour: Int = (departTimeHour*TO_MIN+departTimeMin + timeInWay) / TO_MIN

    val arrivalMinute: Int = arrivalHour % TO_MIN

    println("$arrivalHour:$arrivalMinute")

    val formattedTime = String.format("%02d:%02d", arrivalHour, arrivalMinute)
    println(formattedTime)

}