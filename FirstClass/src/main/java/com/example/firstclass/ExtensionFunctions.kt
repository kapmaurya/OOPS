package com.example.firstclass

fun main()
{
println("Hello kapil ".append("Friend"))
println("This is faltu".removeFirstAndLastChar())
}

fun String.append(toAppend:String):String=this.plus(toAppend)

fun String.removeFirstAndLastChar():String{
    return this.substring(1,this.length-1)
}