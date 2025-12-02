package lesson_2

import kotlin.math.pow

fun main() {

    //Депозит
    val deposit = 70000
    //Процентная ставка
    val interestRate: Double = 0.167

    //считаем процент
    val compoundInt = deposit * (1 + interestRate / 1).pow(20)

    //Форматируем до 3х знаков после запятой и выводим
    val formCompoundInt = (compoundInt * 1000).toInt()
    val formCompoundInt2: Double = formCompoundInt / 1000.toDouble()
    println(formCompoundInt2)

    // Вариант форматирования ниже почему то выводит запятую а не точку
//    val formCompoundInt = String.format("%.3f",compoundInt)
}