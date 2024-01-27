package com.example.firstclass

import java.awt.CardLayout

fun main() {
    val car = Car()
    car.color = "Blue"
    car.model = "mdf"
    println("Car color:${car.color} model:${car.model}")

}


class Car {
    var color: String = "Red"
    var model: String = "XMD"
}

fun drive() {
    println("KAPIL")
}
