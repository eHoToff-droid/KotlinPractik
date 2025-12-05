package lesson_2

import kotlin.math.pow

fun main() {
    val deposit = 70000
    val interestRate = 16.7
    val numberYears = 20
    val annual = 1

    val compoundInt = deposit * (1 + interestRate / 100 * annual).pow(annual * numberYears)

    val formCompoundInt = String.format("%.3f", compoundInt)
    println(formCompoundInt)

}