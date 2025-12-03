package lesson_2

const val CRYSTAL_ORE = 7
const val IRON_ORE = 11
//const val BUFF =1.2

fun main() {

    val bonusCrystal = CRYSTAL_ORE * 1.2 - CRYSTAL_ORE
    val formatedBonusCrystal = bonusCrystal.toInt()
    println("Вы получили дополнительно кристаллической руды:  $formatedBonusCrystal ")

    val bonusIron = IRON_ORE * 1.2 - IRON_ORE
    val formatedBonusIron = bonusIron.toInt()
    println("Вы получили дополнительно железной руды: $formatedBonusIron ")

}