package cor

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

//suspend fun cor.cor.main(){
//    for(i in 0..5){
//        delay(400L)
//        println(i)
//    }
//
//    println("Hello Coroutines")
//}

//suspend fun cor.cor.main() = coroutineScope{
//    launch{
//        for(i in 0..5){
//            delay(400L)
//            println(i)
//        }
//    }
//
//    println("Hello Coroutines")
//}

suspend fun main()= coroutineScope<Unit> {
    launch{ doWork() }
    println("Hello Coroutines")
}

suspend fun doWork(){
    for(i in 0..5){
        println(i)
        delay(4L)
    }
}