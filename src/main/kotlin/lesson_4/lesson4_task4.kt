package lesson_4

fun main() {

    val dayOfTraining = 5
    val isEven = dayOfTraining % 2

    println(
        """
        
        Упражнения для рук:    ${isEven == 1}
        Упражнения для ног:    ${isEven == 0} 
        Упражнения для спины:  ${isEven == 0} 
        Упражнения для пресса: ${isEven == 1}       
        
        
    """.trimIndent()
    )
}


