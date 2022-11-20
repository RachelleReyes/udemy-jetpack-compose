package com.reyesrachelle.mykotlin

fun main() {
    val myListOfNames = listOf("James", "Paul", "Rafael", "Gina")
    print(myListOfNames)

    myListOfNames.forEach {
        println(it)
    }

    for (item in myListOfNames) {
//        print("Names: $item")
    }

    val myMutableList = mutableListOf(12, 34, 45, 123)
    myMutableList.add(34)
    myMutableList.remove(45)
    myMutableList.removeAt(0)
    print(myMutableList)

    val myNewList = mutableListOf<String>()
    myNewList.add("hey")
    myNewList.add("There")
    for (i in 1..10) {
        myNewList.add(i, "Hey $i")
    }
    println(myNewList)

    val myNewImList = listOf(1, 4, 5)

    for (item in myMutableList) {
        println("Number: $item")
    }
    println("Number of elements ${myMutableList.size}")
    println("Second element ${myMutableList[1]}")
    println("Index of element \"two\" ${myMutableList.indexOf(45)}")

    // Set
    val mySet = setOf("US", "MZ", "AU")
    val myMutableSet = mutableSetOf(1, 3, 4, 5)
    myMutableSet.add(3)
    println(mySet)
    println(myMutableSet)

    // Map
    val secretMap = mapOf("Up" to 1, "Down" to 2, "Left" to 3, "Right" to 4)
    println(secretMap.keys)
    println(secretMap.values)

    val myMutableSecretMap = mutableMapOf(
        "One" to 1,
        "Two" to 2,
        "Three" to 3
    )
    myMutableSecretMap["Four"] = 4
    println(myMutableSecretMap)

    if ("Up" in secretMap) println("Yes is in!")
    if (4 in secretMap.values) println("Yes is in")

    // Empty Collections
    val empty = emptyList<String>()
    val emptySet = emptySet<Int>()
    val emptyMap = emptyMap<String, Int>()

    // Collection Filters
    val found = myListOfNames.filter {
        it == "Paul"
    }
    val foundLength = myListOfNames.filter {
        it.length > 4
    }
    val foundEndsWith = myListOfNames.filter {
        it.endsWith("l")
        // it.startsWith("R", ignoreCase = true) && it.endsWith('L', ignoreCase = true)
    }
    print(found)
}