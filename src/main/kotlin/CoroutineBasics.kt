/*
    async + await
*/

import kotlinx.coroutines.*

fun main() = runBlocking {
    val result = async {
        delay(2000)
        10 + 20
    }
    println("Doing Something Else....")
    val total = result.await()
    println("The total is $total")
}