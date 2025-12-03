package lesson_2

const val CRYSTAL_ORE = 7
const val IRON_ORE = 11


fun main() {

    val percent = 20

    val bonusCrystal = (CRYSTAL_ORE * percent) / 100
    println("Вы получили дополнительно кристаллической руды: $bonusCrystal")

    val bonusIron = IRON_ORE * percent / 100
    println("Вы получили дополнительно железной руды: $bonusIron")

}