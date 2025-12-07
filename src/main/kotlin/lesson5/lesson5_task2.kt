package lesson5

fun main() {

    println("Введите Ваш год рождения")
    val yearOfBirth = readln().toInt()
    val currentYear = 2025

    val resultText = if (currentYear - yearOfBirth >= AGE_OF_MAJORITY) {
        "Show special content"
    } else if (currentYear - yearOfBirth == 16 || currentYear - yearOfBirth == 17) {
        "Show limited content"
    } else {
        "Back to main screen"
    }
    println(resultText)
}

const val AGE_OF_MAJORITY = 18