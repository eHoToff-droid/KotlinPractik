package lesson_2

fun main() {
    val mainStaff = 50

    val salaryMain = 30000

    val newStaff = 30

    val salaryNew = 20000

    val costMain: Int = mainStaff * salaryMain
    println(costMain)

    val costTotal: Int = costMain + newStaff * salaryNew
    println(costTotal)

    val salaryAverage: Int = costTotal / (mainStaff + newStaff)
    println(salaryAverage)

}