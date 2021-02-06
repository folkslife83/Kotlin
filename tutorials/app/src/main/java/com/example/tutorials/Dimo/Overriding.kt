package com.example.tutorials.Dimo

fun main(){
    var t = Tiger()
    t.eat()
}

open class Animal{
    open fun eat(){
        println("음식을 먹습니다")
    }
}

class Tiger: Animal(){
    override fun eat(){
        println("고기를 먹습니다")
    }
}