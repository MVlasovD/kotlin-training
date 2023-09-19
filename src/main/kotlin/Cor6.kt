import kotlinx.coroutines.*

fun main() = runBlocking {
    launch { doWorld() }
    println("Hello,")
}

// это ваша первая функция приостановки
suspend fun doWorld() {
    delay(1000L)
    println("World!")
}