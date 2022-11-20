package com.reyesrachelle.mykotlin

fun main() {
    calculate(
        11,
        1000,
        message = "is multiple of",
        11)

    calculate(
        first = 20,
        second = 100,
        message = "is multiple of",
        multipleOf = 12
    )

//    calculateCatAge(age = 7)

    val catAge = calculateCatAge(12) * 10
    print("This cat is $catAge years old")

    print(checkAge(catAge))
    if(checkAge(catAge)) {
        print("This cat is old ($catAge)")
    } else {
        print("This cat is young ($catAge)")
    }

    print(sum(12, 12))
    println(add(12, 10))

    print(calcCatAge(3))

    showName("Paul")

    enhancedMessage(message = "Hello there,") {
        add(12, 12)
    }
}

fun calculate(
    first: Int = 11,
    second: Int = 1000,
    message: String,
    multipleOf: Int
) {
    for (i in first..second) {
        if (i%multipleOf == 0) {
            println("$i $message $multipleOf")
        }
    }
}

//fun calculateCatAge(age: Int): Int {
//    return age * 7
//}

fun calculateCatAge(age: Int): Int = age * 7
fun checkAge(catAge: Int): Boolean {
    return catAge >= 14
}

// val lambdaName: Type = { parameterList -> codeBody }
val add: (Int, Int) -> Int = { a, b -> a + b }
fun sum(a: Int, b: Int): Int {
    return a + b
}

//val calcCatAge: (Int) -> Int = { age -> age * 7 }

val calcCatAge: (Int) -> Int = {
    it * 7
}

val name: (String) -> Unit = {
    print("Hello, my name is $it")
}

fun showName(name: String) {
    print(name)
}

fun enhancedMessage(message: String, funAsParameter: (String) -> Int) {
    println("$message ${funAsParameter("Hey")}")
}