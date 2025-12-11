package lesson5

fun main() {

    println("Введите растояние поездки (в километрах):")
    val distance: Float = readln().toFloat()

    println("Введите расход топлива на 100км вашего автомобиля:")
    val expenceFuel: Float = readln().toFloat()

    println("Введите текущую цену за литр топлива:")
    val priceFuel: Float = readln().toFloat()

    val fuel_is_need = distance * expenceFuel / 100
    val priceTrip = fuel_is_need * priceFuel

    println(
        "На Вашу поездку понадобится: $fuel_is_need литров топлива,  \n" +
                "Стоимость поездки: ${String.format("%.2f", priceTrip)} денег"
    )

}