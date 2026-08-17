import kotlinx.coroutines.*

fun main() = runBlocking {

    println("Main started")

    launch {
        println("Task started")
        delay(2000)
        println("Task finished")
    }

    println("Main finished")
}