package com.example.tutorials.Dimo.Abstract
//추상클래스는 미완성. 단독으로 인스턴스 생성 불가. 서브클래스에서 각자 정의해둬야함.
//추상함수는 생성자를 가질수 있으나 인터페이스는 생성자 가질수 없다.
//인터페이스에서 구현부 있는 함수 -> open 함수로 간주, 구현부 없는 함수 -> abstract 함수로 간주

fun main(){
    var r = Rabbit()
    r.eat()
    r.sniff()
}

abstract class Animal{
    abstract fun eat()
    fun sniff(){
        println("킁킁")
    }
}

class Rabbit: Animal(){
    override fun eat(){
        println("당근을 먹습니다")
    }
}