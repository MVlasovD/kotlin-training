package cor

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = GlobalScope.launch { // запуск новой сопрограммы с сохранением ссылки на нее в Job
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    job.join() // ждем завершения вложенной сопрограммы
}