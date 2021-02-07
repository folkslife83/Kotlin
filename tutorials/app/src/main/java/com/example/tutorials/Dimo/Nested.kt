package com.example.tutorials.Dimo.Nested
// Nested class - Outer class 내부에 존재하나 독립적. 형태만 내부 외부클래스 내용 공유 불가
// Inner class - Outer class 내부에 존재. 외부클래스의 속성과 함수 사용 가능. 혼자서 객체생성 x 외부클래스객체 필요
fun main(){
    val outer = Outer()
    val inner = outer.Inner()
    inner.introduceInner()
    inner.introduceOuter()
    outer.text = "Changed Outer Class"
    inner.introduceOuter()
}
class Outer{
    var text = "Outer Class"
    class Nested{
        fun introduce(){
            println("Nested Class")
        }
    }
    inner class Inner{
        var text = "Inner Class"
        fun introduceInner(){
            println(text)
        }
        fun introduceOuter(){
            println(this@Outer.text)
        }
    }
}


