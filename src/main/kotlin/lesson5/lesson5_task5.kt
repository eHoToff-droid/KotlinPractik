package lesson5

fun main() {

    val randomNumbers = List(3) { (1..42).random() }
//    println( randomNumbers)

    println("Введите по очереди 3 числа от 0 до 42:")
    val numberInput1 = readln().toInt()
    val numberInput2 = readln().toInt()
    val numberInput3 = readln().toInt()

    val inputNumbers = mutableListOf<Int>(numberInput1, numberInput2, numberInput3)

    val intersectionList = randomNumbers.intersect(inputNumbers)
    val numberOfMatches = intersectionList.size

    when (numberOfMatches) {
        3 -> println("Вы угадали все числа и сорвали Джекпот!")
        2 -> println("Вы угадали 2 числа и получаете Крупный приз")
        1 -> println("Вы угадали 1 число и получаете утешительный  приз")
        0 -> println("К счастью для нас вы ничего не выиграли")
    }
    println("Выпавшие числа: $randomNumbers")

}