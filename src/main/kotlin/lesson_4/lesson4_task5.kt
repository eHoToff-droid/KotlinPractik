package lesson_4

fun main() {

    val hasDamage = false
    val numberOfCrew = 69
    val boxFood = 60
    val weatherGood = true

    val conditionForSalling: Boolean = ((hasDamage == HAS_DAMAGE) &&
            (numberOfCrew in MIN_CREW..MAX_CREW) &&
            (boxFood > MIN_PROVISION) &&
            (weatherGood == WEATHER_GOOD)) ||
            ((hasDamage != HAS_DAMAGE) &&
                    (numberOfCrew == MAX_CREW) &&
                    (boxFood > MIN_PROVISION) &&
                    (weatherGood == WEATHER_GOOD))
    println("Научно-исследовательский корабль может приступить к долгосрочному плаванию: $conditionForSalling")

}

const val MIN_PROVISION = 50
const val MIN_CREW = 55
const val MAX_CREW = 70
const val HAS_DAMAGE = true
const val WEATHER_GOOD = true