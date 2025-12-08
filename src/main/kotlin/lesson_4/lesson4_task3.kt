package lesson_4

fun main() {

    val isSunny: Boolean = true
    val isAwningOpen: Boolean = true
    val humidity: Int = 20
    val season: String = "winter"

    println(
        "Благоприятные ли условия сейчас для роста бобовых?: " +
                "${
                    (isSunny == SUN_WEATHER) && (isAwningOpen == OPEN_TENT) &&
                            (humidity == AIR_HUMIDITY) && (season != SEASON)
                }"
    )

}

const val SUN_WEATHER: Boolean = true
const val OPEN_TENT: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val SEASON = "winter"
