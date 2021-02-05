package com.example.tutorials.variousFn

fun main() {
    val source = "Hello World!"
    val target = "Kotlin"
//    val target = "Kotlin123456"

    println(source.getLongString(target))         //  String 클래스의 멤버 원본에는 없는 함수
    // "Hello World!".getLongString("Kotlin") 형태로 작성 가능

}

// String을 확장해 getLongString 함수 추가. 정식 멤버가 되는것은 아니다.
fun String.getLongString(target: String): String =
        if (this.length > target.length) this else target  //this는 확장 대상 source 객체
