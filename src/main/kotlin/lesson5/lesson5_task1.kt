package lesson5

fun main() {

    println("Сложите пожалуйста числа 7 и 8, и введите сумму ниже:")
    val summa = readln().toInt()

    val access = if (summa == 15) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещен"
    }
    println(access)
}

