package com.example.firstclass

fun main() {

    val person = Person(
        name = "Joe",
        lastname = "Balt",
        age = 25
    )

    val person2 = Person(
        name = "Jully",
        lastname = "valt",
        age = 26
    )

    val person3 = Person(
        name = "hely",
        lastname = "salt",
        age = 29
    )

    val listofPeople= listOf(person,person2,person3)
    listofPeople.forEach { item ->
        println(item.age)
    }


}

data class Person(val name: String, val lastname: String, val age: Int)
