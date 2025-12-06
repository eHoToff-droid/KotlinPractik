package lesson3

fun main() {

    val turnChes: String = "D2-D4;0"

    val parsingTurn: List<String> = turnChes.split("-", ";")

    val fromWhere = parsingTurn[0]
    println(fromWhere)

    val where = parsingTurn[1]
    println(where)

    val numberTurn = parsingTurn[2]
    println(numberTurn)

}