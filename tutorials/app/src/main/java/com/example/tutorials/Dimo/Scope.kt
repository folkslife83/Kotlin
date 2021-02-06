package com.example.tutorials.Dimo.Scope
/**
 패키지스코프
 public : 어떤 패키지에서도 접근 가능
 internal : 같은 모듈 내에서만 접근 가능
 private : 같은 파일 내에서만 접근 가능

 클래스스코프
 public : 클래스 외부에서 접근 가능
 private : 클래스 내부에서만 접근 가능
 protected : 클래스 자신과 상속받은 클래스에서 접근 가능


 */
val a = "Package Scope"

class B {
    val a = "Class Scope"

    fun print(){
        println(a)
    }
}
fun main() {
    val a = "Function Scope"
    println(a)
    B().print()
}