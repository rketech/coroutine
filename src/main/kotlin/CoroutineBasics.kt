import kotlinx.coroutines.*

fun main() {

    val scope = CoroutineScope(Dispatchers.Default)

    scope.launch {
        println("Coroutine is running")
        delay(2000)
        println("Coroutine finished")
    }

    Thread.sleep(3000)
}