package com.example.tutorials.Dimo
//Singleton Pattern // 클래스의 인스턴스를 단 하나만 만들어 사용하도록 하는 코딩 아키텍쳐 패턴
//object 로 선언된 객체는 최초사용시 자동생성, 이후 코드 전체에서 공용으로 사용 가능

fun main(){
    println(Counter.count)

    Counter.countup()
    Counter.countup()

    println(Counter.count)

    Counter.clear()

    println(Counter.count)

}
object Counter{
    var count = 0
    fun countup(){
        count++
    }
    fun clear(){
        count = 0
    }
}