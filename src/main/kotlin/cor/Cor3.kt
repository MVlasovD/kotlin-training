package cor

import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch { // запуск новой сопрограммы в фоне
        delay(1000L)
        println("World!")
    }
    println("Hello,") // основной поток продолжает свою работу
    runBlocking {     // но это выражение блокирует основной поток
        delay(2000L)  // на 2 секунды
    }
}