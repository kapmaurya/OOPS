package com.example.firstclass

fun main() {
    val car = Caar(color = "Green", model = "LLm")
    println("Car color:${car.color}")
}

class Caar(var color: String = "Blue", var model: String = "xmdle") {

}