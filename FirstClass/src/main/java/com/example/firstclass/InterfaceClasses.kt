package com.example.firstclass

import java.awt.Label

fun main() {
    val button = Button(label = "Button")
    button.onClick(message = "This is a BTN")

    val superMerio = Character(name = "Super Mario")
    superMerio.onClick(message = "This is an actor!")
}

class Button(val label: String) : ClickEvent {
    override fun onClick(message: String) {
        println("Clicked by $label and $message")
    }

}

class Character(val name: String) : ClickEvent {
    override fun onClick(message: String) {
        println("Clicked by $name and here's a message $message")
    }

}

interface ClickEvent {
    fun onClick(message: String)
}