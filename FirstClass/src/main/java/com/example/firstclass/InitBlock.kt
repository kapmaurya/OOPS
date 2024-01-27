package com.example.firstclass

fun main() {
    val car = Bus(color = "Green", model = "LLm")
    car.color = "Black"
    car.model = "QLM"
    println("Car color:${car.color} model:${car.model}")
}

class Bus(
    var color: String,
    var model: String
) {
    init {
        if (color == "Green") {
            println("yaaah Green")
        } else {
            println("$color is not Green")
        }
    }
}