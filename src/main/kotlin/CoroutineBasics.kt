import kotlinx.coroutines.*

/* CoroutineScope */

fun main() {

    /*
    In Kotlin Coroutines, a dispatcher is a mechanism that determines which thread or thread pool a coroutine uses for its execution.
    It acts as a scheduler, deciding whether a coroutine runs on the main UI thread, a background thread for CPU-intensive tasks,
    or a thread for I/O operations.

    CoroutineScope manages the lifecycle of a Coroutine
    */
    val scope = CoroutineScope(Dispatchers.Default)

    scope.launch {
        println("Coroutine is running")
        delay(2000)
        println("Coroutine finished")
    }

    Thread.sleep(3000)
}