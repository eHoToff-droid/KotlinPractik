package lesson_1

//время в космосе в секундах
const val TIMEINSEC: Int = 6480

fun main() {

    // перевод секунд в  минуты
    val minute: Int = TIMEINSEC / 60

    //перевод секунд в часы
    val hour: Int = TIMEINSEC / 3600

    //остаток секунд
    val remainedSecund = TIMEINSEC % 60

    //остаток минут
    val remainedMinute = minute % 60

    //форматируем время
    val formattedTime = String.format("%02d:%02d:%02d", hour, remainedMinute, remainedSecund)

    //вывод времени проведенное в космосе
    println(formattedTime)
}
