package cor

import kotlinx.coroutines.*

fun main() = runBlocking { // this: CoroutineScope
    launch {
        delay(200L)
        println("Task from runBlocking")
    }

    coroutineScope { // Создание coroutine scope
        launch {
            delay(500L)
            println("Task from nested launch")
        }

        delay(100L)
        println("Task from coroutine scope") // Эта строка будет выведена перед вложенным launch
    }

    println("Coroutine scope is over") // Эта строка не будет выведена пока не выполнится вложенный launch
}