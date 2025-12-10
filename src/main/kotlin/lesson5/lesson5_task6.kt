package lesson5

import kotlin.math.pow

fun main() {
    println("Введите ваш вес в кг:")
    val weight = readln().toDouble()

    println("Введите ваш рост в см:")
    val heightMeter = readln().toFloat() / 100

    val imt = weight / heightMeter.pow(2)

    val resultText = if (imt < UNDERWEIGHT) {
        println("- ИМТ<18.5 : Недостаточная масса тела")
        "-У Вас недостаточная масса тела"
    } else if (imt >= UNDERWEIGHT && imt < NORMA_WEIGHT) {
        println("- 18.5 ≤ ИМТ < 25: Нормальная масса тела")
        "-У Вас нормальная масса тела"

    } else if (imt >= NORMA_WEIGHT && imt < OVERWEIGHT) {
        println("- 25 ≤ ИМТ < 30: Избыточная масса тела")
        "-У Вас избыточная масса тела"
    } else {
        println("- ИМТ ≥ 30: Ожирение")
        "-У Вас ожирение"
    }

    println("Ваш ИМТ = ${String.format("%.2f", imt)} $resultText")
}

const val UNDERWEIGHT = 18.5
const val NORMA_WEIGHT = 25.0
const val OVERWEIGHT = 30.0
