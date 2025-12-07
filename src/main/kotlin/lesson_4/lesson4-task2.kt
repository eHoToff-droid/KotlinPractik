package lesson_4

fun main() {

    val weightCargo1 = 20
    val volumeCargo1 = 50

    val weightCargo2 = 50
    val volumeCargo2 = 100

    println(
        "Груз с весом $weightCargo1 кг и объемом $volumeCargo1 л соответствует категории 'Average':" +
                " ${(MIN_WEIGHT < weightCargo1) && (weightCargo1 <= MAX_WEIGHT) && (volumeCargo1 < MAX_VOLUME)}"
    )

    println(
        "Груз с весом $weightCargo2 кг и объемом $volumeCargo2 л соответствует категории 'Average':" +
                " ${(MIN_WEIGHT < weightCargo2) && (weightCargo2 <= MAX_WEIGHT) && (volumeCargo2 < MAX_VOLUME)}"
    )

}

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100