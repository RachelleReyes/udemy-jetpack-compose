package com.reyesrachelle.mykotlin

import java.io.IOException
import java.lang.NullPointerException

fun main() {
//    val input = Result.ERROR
//    getResult(result = input)
    Repository.startFetch()
    getResult(result = Repository.getCurrentState())
    Repository.finishedFetch()
    getResult(result = Repository.getCurrentState())
    Repository.error()
    getResult(result = Repository.getCurrentState())

    Repository.anotherCustomFailure()
    getResult(result = Repository.getCurrentState())
    Repository.customFailure()
    getResult(result = Repository.getCurrentState())
}

fun getResult(result: Result) {
    return when(result) {
        is Error -> println(result.exception)
        is Success -> println(result.dataFetched?: "Ensure you start fetch function first")
        is Loading -> println("Loading")
        is NotLoading -> println("Idle")
        is Failure.AnotherCustomFailure -> println(result.anotherCustomFailure.toString())
        is Failure.CustomFailure -> println(result.customFailure.toString())
//        else -> print("N/A") // Enums are exhaustive, it doesn't require else branch
    }
}

// Only one instance
object Repository {
    private var loadState: Result = NotLoading
    private var dataFetched: String? = null

    fun startFetch() {
        loadState = Loading
        dataFetched = "data"
    }

    fun finishedFetch() {
        loadState = Success(dataFetched)
        dataFetched = null
    }

    fun error() {
        loadState = Error(exception = Exception("Exception"))
    }

    fun getCurrentState(): Result {
        return loadState
    }

    fun anotherCustomFailure() {
        loadState = Failure.AnotherCustomFailure(anotherCustomFailure =
        NullPointerException("Something went wrong"))
    }

    fun customFailure() {
        loadState = Failure.CustomFailure(customFailure = IOException("Custom failure"))
    }
}

// Sealed classes are abstract classes
sealed class Result

// We can emit messages
data class Success(val dataFetched: String?): Result()
data class Error(val exception: Exception): Result()
object NotLoading: Result()
object Loading: Result()


sealed class Failure: Result() {
    data class CustomFailure(val customFailure: IOException): Failure()
    data class AnotherCustomFailure(val anotherCustomFailure: java.lang.NullPointerException): Failure()
}

// We can't attach more data to each type => Solution is to use an abstract class
//enum class Result {
//    SUCCESS,
//    ERROR,
//    IDLE,
//    LOADING
//}