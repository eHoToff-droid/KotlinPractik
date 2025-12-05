package lesson_4

fun main() {

    val dayOfTraining = 5

    val handAndPress = 1
    val legsAndBack = 0

    println(
        """
        
        Упражнения для рук:    ${dayOfTraining % 2 == handAndPress}
        Упражнения для ног:    ${dayOfTraining % 2 == legsAndBack} 
        Упражнения для спины:  ${dayOfTraining % 2 == legsAndBack} 
        Упражнения для пресса: ${dayOfTraining % 2 == handAndPress}       
        
        
    """.trimIndent()
    )
}


