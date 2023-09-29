package cor

import kotlinx.coroutines.*

fun main() = runBlocking {
    repeat(100_000) { // запуск большого количества сопрограмм
        launch {
            delay(5000L)
            println(". ${it.inc()}")
            (1 until 10).forEach { println(it) }
        }
    }
}
