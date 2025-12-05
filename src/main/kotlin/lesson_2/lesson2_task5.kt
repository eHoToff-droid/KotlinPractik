package lesson_2

import kotlin.math.pow

fun main() {
    val deposit = 70000
    val interestRate: Double = 16.7
    val numberYears = 20
    val annual = 1


    val compoundInt = deposit * (1 + interestRate / 100 * annual).pow(annual * numberYears)

    val formCompoundInt = (compoundInt * 1000).toInt()
    val formCompoundInt2: Double = formCompoundInt / 1000.toDouble()
    println(formCompoundInt2)

}