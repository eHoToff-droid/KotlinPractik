package lesson_2

fun main() {
    //основной персонал
    val mainStaff = 50

    //зп основного работника
    val salaryMain = 30000

    //стажеры
    val newStaff = 30

    //зп стажера
    val salaryNew = 20000

    //  расходы на основных работников
    val costMain: Int = mainStaff * salaryMain
    println(costMain)

    //  расходы на всех работников
    val costTotal: Int = costMain + newStaff * salaryNew
    println(costTotal)

    //средняя зп в фирме
    val salaryAverage: Int = costTotal / (mainStaff + newStaff)
    println(salaryAverage)

}