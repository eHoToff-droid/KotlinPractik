package lesson_2

//основной персонал
const val   MAINS_STAFF =50
//зп основного работника
const val  SALARY_MAIN =30000
//стажеры
const val  NEW_STAFF=30
//зп стажера
const val  SALARY_NEW =20000


fun main() {
    //  расходы на основных работников
    val  costMain: Int = MAINS_STAFF*SALARY_MAIN
    println(costMain)

    //  расходы на всех работников
    val costTotal: Int = costMain+NEW_STAFF*SALARY_NEW
    println(costTotal)

    //средняя зп в фирме
    val  salaryAverage: Int = costTotal/(MAINS_STAFF+NEW_STAFF)
    println(salaryAverage)

}