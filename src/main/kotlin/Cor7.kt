import kotlinx.coroutines.*

fun main() = runBlocking {
    repeat(100_000) { // запуск большого количества сопрограмм
        launch {
            delay(5000L)
            println(".")
        }
    }
}
