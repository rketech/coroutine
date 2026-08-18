/*
    async + await
*/

import kotlinx.coroutines.*

fun main() = runBlocking {
    val price = async {
        delay(2000)
        10
    }

    val quantity = async{
        delay(2000)
        50
    }

    println("Doing Something Else....")
    val total = price.await() * quantity.await()
    println("The total is $total")
}