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

fun main(): Unit = runBlocking {
    launch(Dispatchers.Default){
        println("Default Thread: ${Thread.currentThread().name}")
    }

    launch(Dispatchers.IO) {
        println("IO Thread: ${Thread.currentThread().name}")
    }
}