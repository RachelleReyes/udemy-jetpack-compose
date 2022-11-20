package com.reyesrachelle.mykotlin

fun main() {
//    val input = Result.ERROR
//    getResult(result = input)
    Repository.startFetch()
    getResult(result = Repository.getCurrentState())
    Repository.finishedFetch()
    getResult(result = Repository.getCurrentState())
    Repository.error()
    getResult(result = Repository.getCurrentState())
}

fun getResult(result: Result) {
    return when(result) {
        Result.SUCCESS -> println("Success!")
        Result.ERROR -> println("Error")
        Result.IDLE -> println("Idle")
        Result.LOADING -> println("Loading...")
    }
}

// Only one instance
object Repository {
    private var loadState: Result = Result.IDLE
    private var dataFetched: String? = null

    fun startFetch() {
        loadState = Result.LOADING
        dataFetched = "data"
    }

    fun finishedFetch() {
        loadState = Result.SUCCESS
        dataFetched = null
    }

    fun error() {
        loadState = Result.ERROR
    }

    fun getCurrentState(): Result {
        return loadState
    }
}

//abstract class Result
//
//data class Success(val dataFetched: String?): Result()
//data class Error(val exception: Exception): Result()
//object NotLoading: Result()
//object Loading: Result()

// We can't attach more data to each type => Solution is to use an abstract class
enum class Result {
    SUCCESS,
    ERROR,
    IDLE,
    LOADING
}