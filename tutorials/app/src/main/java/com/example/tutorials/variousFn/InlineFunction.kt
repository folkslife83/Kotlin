package com.example.tutorials.variousFn

fun main() {
    // 인라인 함수 shortFunc의 내용이 복사되어 들어감. 함수의 분기 없이 처리 -> 성능 증가
    // 함수 재사용이 많은 경우 코드가 방대해짐
    shortFunc(3) { println("First call: $it") }
    shortFunc(5) { println("Second call: $it") }
}

inline fun shortFunc(a: Int, out: (Int) -> Unit) {  // () -> Unit 반환자료형이 없는경우
    println("Before calling out()")
    out(a)
    println("After calling out()")
}

//성능상의 이유로 인라인 함수는 일반함수에도 사용가능하나 람다식을 매개변수로 가진 함수에 사용할것을 추천함

/**
inline fun sub(out1: ()-> Unit, noinline out2:()-> Unit ){
}
// noinline 부분은 복사되지 않음, 호출하여 사용
*/