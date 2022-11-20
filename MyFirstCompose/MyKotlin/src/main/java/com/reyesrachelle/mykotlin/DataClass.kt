package com.reyesrachelle.mykotlin

fun main() {
    val person = Person(
        name = "Rachelle",
        lastName = "Reyes",
        age = 25
    )
    println(person)

    val aroni = Person("Ruti", "Machava", 54)
    val ruti = Person("Ruti", "Machava", 54)

    val listOfPeople = listOf(person, aroni, ruti)
    listOfPeople.forEach { item ->
        println(item.age)
    }

}

data class Person(val name: String, val lastName: String, val age: Int)