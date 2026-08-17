import kotlinx.coroutines.*

// "This function may suspend, so it must be called from a coroutine or another suspend function."
suspend fun doWork() {
    println("Work Started")
    delay(2000)
    println("Work Finished")
}

fun main() = runBlocking {
    println("Main Started")
    launch { doWork() }.join() // launch creates the coroutine, and doWork() is called inside it.
    println("Main Finished")
}