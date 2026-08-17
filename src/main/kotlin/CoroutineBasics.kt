/*
    Coroutine Exceptions
*/

import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        try {
            println("Task Started")
            throw Exception("Something went wrong")
        }catch (e: Exception) {
            println(e.message)
        }
    }
    println("Main Continue")
}