/*
Structured Concurrency

This sounds fancy, but the idea is simple:

Child coroutines belong to their parent scope.
*/

import kotlinx.coroutines.*

fun main(): Unit = runBlocking {

    launch {
        println("Task 1")
        delay(9000)
        println("Task 1 Completed")
    }

    launch {
        println("Task 2")
        delay(5000)
        println("Task 2 Completed")
    }

    println("Parent is Working")
}