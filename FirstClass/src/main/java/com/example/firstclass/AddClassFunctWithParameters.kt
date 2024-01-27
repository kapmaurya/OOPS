package com.example.firstclass

fun main() {
    val abc = Caro(color = "Green", model = "LLm")
    abc.color = "Black"
    println("Car color:${abc.color} mode:${abc.model}")

    abc.speed(minSpeed = 100, maxSpeed = 199)

}

class Caro(
    var color: String,
    val model: String
) {

    init {
        if (color == "Green") {
            println("yaaah Green")
        } else {
            println("$color is not green")
        }
    }

    fun speed(minSpeed: Int, maxSpeed: Int) {
        println("Min speed is $minSpeed and MaxSpeed:$maxSpeed")
    }

}