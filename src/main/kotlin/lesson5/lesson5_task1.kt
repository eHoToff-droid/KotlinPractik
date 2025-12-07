package lesson5

fun main() {

    println("Сложите пожалуйста числа 7 и 8, введите сумму ниже:")
    val summa = readln().toInt()

    val access = if (summa == CHECK_SUM) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещен"
    }
    println(access)
}

const val CHECK_SUM = 15