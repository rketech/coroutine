/*
    Dispatchers.Default
            ↓
    CPU-intensive work

    Dispatchers.IO
            ↓
    Network / database / file I/O

    Dispatchers.Main
            ↓
    Android UI

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