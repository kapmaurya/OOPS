package com.example.firstclass

fun main() {


    //Truck
    val truck = Truck(color = "Mgenta", model = "F15")
    truck.drives()
    truck.speed(minSpeed = 100, maxSpeed = 19)
}

class Truck(color: String, model: String) : Cars(color, model) {
    override fun speed(minSpeed: Int, maxSpeed: Int) {
        val fullSpeed = minSpeed * maxSpeed
        println("Truck speed $fullSpeed")

    }

    override fun drives() {
        println("bhfhbh")
    }
}

open class Cars(var color: String, val model: String) {

    open fun drives() {
        println("dddd")
    }

    open fun speed(minSpeed: Int, maxSpeed: Int) {
        println("Min speed is $minSpeed and MaxSpeed:$maxSpeed")
    }

}
