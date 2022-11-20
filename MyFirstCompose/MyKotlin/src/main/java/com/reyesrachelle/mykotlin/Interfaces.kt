package com.reyesrachelle.mykotlin

fun main() {
    val button = Button(label = "Button")
     button.onClick(message = "This is a Button")

    val superMario = Character(name = "Super Mario")
    superMario.onClick("This is an actor!")
}

class Button(val label: String): ClickEvent {
    override fun onClick(message: String) {
        println("Clicked by $label and here's a message $message")
    }
}

class Character(val name: String): ClickEvent {
    override fun onClick(message: String) {
        println("Clicked by $name and here's a message $message")
    }
}

// Interfaces
interface ClickEvent {
    fun onClick(message: String)
}

