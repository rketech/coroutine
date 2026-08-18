/*
    withContext
*/

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Main: ${Thread.currentThread().name}")

    // The special instruction is:
    // "Run this block using the IO dispatcher, and don't continue to the next line until this block has produced its result."
    // That's the key.
    val result = withContext(Dispatchers.IO) {
        println("IO: ${Thread.currentThread().name}")
        "Data Received"
    }
    println(result)
    println("Back: ${Thread.currentThread().name}")
}