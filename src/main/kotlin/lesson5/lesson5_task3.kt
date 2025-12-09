package lesson5

fun main() {

    val winNumber1 = 4
    val winNumber2 = 16

    println("Введите первое число от 0 до 42:")
    val number1 = readln().toInt()

    println("Введите второе число от 0 до 42:")
    val number2 = readln().toInt()

    val guessNumber: Int

    if ((number1 == winNumber1 || number1 == winNumber2) &&
        (number2 == winNumber1 || number2 == winNumber2)
    ) {
        guessNumber = 2
    } else if (number1 != winNumber1 && number1 != winNumber2 &&
        number2 != winNumber1 && number2 != winNumber2
    ) {
        guessNumber = 0
    } else {
        guessNumber = 1
    }

    when (guessNumber) {
        0 -> println("Неудача! Выигрившие числа $winNumber1 и $winNumber2")
        1 -> println("Вы выиграли утешительный приз! Выигрившие числа $winNumber1 и $winNumber2")
        2 -> println("Поздравляем! Вы выиграли главный приз!")
    }

}