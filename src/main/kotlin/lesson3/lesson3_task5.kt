package lesson3

fun main() {

    val turnChes: String = "D2-D4;0"

    val fromWhere: String = turnChes.take(2)
    println("Откуда: $fromWhere")

    val where: String = turnChes.substring(3, 5)
    println("Куда: $where")

    val parsingTurn: List<String> = turnChes.split(";")
    val numberTurn = parsingTurn[1]
    println("номер хода: $numberTurn")
}