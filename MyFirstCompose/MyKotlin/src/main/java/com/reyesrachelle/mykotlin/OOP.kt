package com.reyesrachelle.mykotlin

fun main() {
    val car = Car(color = "Green", model = "LLm")
    val secondCar = Car(color = "Purple", model = "XXL")
    car.color = "Black"
    car.speed(minSpeed = 100, maxSpeed = 199)
    car.drive()

    println("Car color ${car.color} model: ${car.model}")
    println("Second car color ${secondCar.color} model: ${secondCar.model}")

    // We're inheriting from String
    val name: String

    // Truck
    val truck = Truck(color = "Magenta", model = "F16")
    truck.drive()
    truck.speed(minSpeed = 20, maxSpeed = 90)
}

class Truck(color: String, model: String): Car(color, model) {
    override fun speed(minSpeed: Int, maxSpeed: Int) {
        val fullSpeed = minSpeed * maxSpeed
        println("Truck full speed: $fullSpeed")
    }

    override fun drive() {
        println("Vroom... Like a truck!")
    }
}

open class Car(var color: String, val model: String) {
    // We can omit these declarations
//    var color: String = color
//    var model: String = model

//    init {
//        if (color == "Green") {
//            println("Yay green")
//        } else {
//            println("$color is not green")
//        }
//
//        // Overrides passed value
////        color = "Yellow"
////        model = "KLMM"
//    }

    open fun speed(minSpeed: Int, maxSpeed: Int) {
        println("Min speed is $minSpeed and MaxSpeed: $maxSpeed")
    }

    open fun drive() {
        println("Drive....vrooom")
    }
}
