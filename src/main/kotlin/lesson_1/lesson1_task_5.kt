package lesson_1

fun main() {


    val seconds: Short = 6480

    //остаток от минут
    val remaindMinut = seconds%60
    // println(remaindMinut)

    //остаток от часа
    val remaindHour = seconds%3600
    // println(remaindHour)

    val  minute: Int = remaindHour/60
    val hour: Int= seconds/3600

    println("$hour : $minute : 0$remaindMinut  ")








}