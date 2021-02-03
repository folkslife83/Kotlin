package com.example.tutorials.basic

fun main(){
    val hello1 = "hello world"
    var hello2: String = "hello world2" // null unavailable
    var hello3: String? = "hello world3" // null available

    print(hello1)
    print("on the same line")
    println("")
    println(hello2)
    println(hello3)
    println(hello())
    hello3 = null
    println(hello3)
}

fun hello(): String{
    return "hello fun!"
}