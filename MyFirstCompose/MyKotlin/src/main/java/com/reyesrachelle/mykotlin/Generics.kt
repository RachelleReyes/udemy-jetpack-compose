package com.reyesrachelle.mykotlin

fun main() {
    val listOfItems = listOf("Rafael", "Gina", "George", "James")
    val listOfNumbers = listOf(23, 45, 45)

    val person = Person(
        name = "Rachelle",
        lastName = "Reyes",
        age = 25
    )
    val aroni = Person("Ruti", "Machava", 54)
    val ruti = Person("Ruti", "Machava", 54)

    val listOfPeople = listOf(person, aroni, ruti)

    val finder = Finder(list = listOfPeople)
    finder.findItem(element = ruti) {
        println("Found $it")
    }
}

class Finder<T>(private val list: List<T>) {
    fun findItem(element: T, foundItem: (element: T?) -> Unit) {
        val itemFoundList = list.filter {
            it == element
        }
        if(itemFoundList.isNullOrEmpty()) foundItem(null) else
            foundItem(itemFoundList.first())
    }
}

//class Finder(private val list: List<String>) {
//    fun findItem(element: String, foundItem: (element: String?) -> Unit) {
//        val itemFoundList = list.filter {
//            it == element
//        }
//        if(itemFoundList.isNullOrEmpty()) foundItem(null) else
//            foundItem(itemFoundList.first())
//    }
//}