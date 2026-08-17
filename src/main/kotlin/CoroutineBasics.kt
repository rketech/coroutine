/*
The mental model:

    delay()
        Coroutine ──⏸️──→ resumes
        Thread    ─────────→ can do other work

    versus:

    Thread.sleep()
        Thread ──⏸️──→ blocked
        Coroutine ─────→ can't use that thread
*/

import kotlinx.coroutines.*

// "This function may suspend, so it must be called from a coroutine or another suspend function."
suspend fun doWork() {
    println("Work Started")
//    delay(2000)
    Thread.sleep(10000)
    println("Work Finished")
}

fun main() = runBlocking {
    println("Main Started")
    // The important thing is understanding that launch doesn't promise when the coroutine gets CPU time.
    // launch creates the coroutine, and doWork() is called inside it.
    launch { doWork() }.join()
    println("Main Finished")
}