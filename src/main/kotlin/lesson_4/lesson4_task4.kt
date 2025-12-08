package lesson_4

fun main() {

    val dayOfTraining = 5
    val isEven = 0

    println(
        """
        
        Упражнения для рук:    ${dayOfTraining % 2 != isEven}
        Упражнения для ног:    ${dayOfTraining % 2 == isEven} 
        Упражнения для спины:  ${dayOfTraining % 2 == isEven} 
        Упражнения для пресса: ${dayOfTraining % 2 != isEven}       
        
        
    """.trimIndent()
    )
}


