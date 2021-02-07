package com.example.tutorials.Dimo.Generic

fun main(){
    // UsingGeneric<A>(A()).doShouting() // 타입파라미터를 수동으로 전달
    UsingGeneric(A()).doShouting() // 생성자 파라미터 통해 클래스 A 임을 알수 있으므로 생략
    UsingGeneric(B()).doShouting()
    UsingGeneric(C()).doShouting()
    UsingGeneric2(D()).doShouting()
    doShouting(B())
}
fun <T: A> doShouting(t: T){
    t.shout()          //함수도 Generic 의 타입을 자동으로 추론한다
}
open class A {
    open fun shout(){
        println("A가 소리칩니다")
    }
}
class B: A(){
    override fun shout(){
        println("B가 소리칩니다")
    }
}
class C: A(){
    override fun shout(){
        println("C가 소리칩니다")
    }
}
class D: A(){
    override fun shout(){
        println("D가 소리칩니다")
    }
}
class UsingGeneric<T: A>(val t: T){
    fun doShouting(){
        t.shout()
    }
}

//동작은 같으나 성능이 Generic 보다 뒤쳐짐
class UsingGeneric2(val t: A){
    fun doShouting(){
        t.shout()
    }
}