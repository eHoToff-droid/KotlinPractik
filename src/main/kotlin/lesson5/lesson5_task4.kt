package lesson5

fun main() {

    println("Да, вперед, пожалуйста, вводите свои данные...:")
    val userName = readln()

    val inputData = if (userName == USER_NAME) {
        println("Введите пароль")
        val password = readln()
        if (password == PASSWORD) {
            "вам разрешено входить на борт корабля \"Heart of Gold\""
        } else {
            "Не правильный пароль"
        }

    } else {
        "Зарегестирируйтесь пожалуйста"
    }

    println(inputData)

}

const val USER_NAME = "Zaphod"
const val PASSWORD = "PanGalactic"