package com.example.tutorials.Dimo
//두가지 interface 에서 상속받는 클래스 구현
fun main(){
    var a = Dog()
    a.run()
    a.eat()

}
interface Runner{
    fun run()
}

interface Eater{
    fun eat(){
        println("음식을 먹습니다")
    }
}
class Dog : Runner, Eater{
    override fun run(){
        println("우다다다 뜁니다")
    }
    override fun eat(){
        println("허겁지겁 먹습니다")
    }
}
