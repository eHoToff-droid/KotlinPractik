package lesson_4

fun main() {

    val noDamage = false
    val numberOfCrew = 69
    val boxFood = 60
    val weatherGood = true

    val conditionForSalling: Boolean = ((noDamage == NO_DAMAGE) && (numberOfCrew in MIN_CREW..MAX_CREW)
            && (boxFood > 50) && (weatherGood == WEATHER_GOOD)) || ((noDamage != NO_DAMAGE)
            && (numberOfCrew == MAX_CREW) && (boxFood > 50) && (weatherGood == WEATHER_GOOD))
    println("Научно-исследовательский корабль может приступить к долгосрочному плаванию: $conditionForSalling")

}

const val MIN_CREW = 55
const val MAX_CREW = 70
const val NO_DAMAGE = true
const val WEATHER_GOOD = true