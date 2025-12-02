package lesson_1

const val CONVERT_MIN = 60
const val CONVERT_HOUR = 3600

fun main() {
    //время в космосе в секундах
    val TIMEINSEC: Int = 6480

    // перевод секунд в  минуты
    val minute: Int = TIMEINSEC / CONVERT_MIN

    //перевод секунд в часы
    val hour: Int = TIMEINSEC / CONVERT_HOUR

    //остаток секунд
    val remainedSecund = TIMEINSEC % 60

    //остаток минут
    val remainedMinute = minute % 60

    //форматируем время
    val formattedTime = String.format("%02d:%02d:%02d", hour, remainedMinute, remainedSecund)

    //вывод времени проведенное в космосе
    println(formattedTime)
}
