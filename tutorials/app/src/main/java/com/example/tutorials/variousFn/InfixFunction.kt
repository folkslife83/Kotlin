package com.example.tutorials.variousFn
/**
중위 함수의 조건
- 멤버 메서드 또는 확장 함수여야 한다
- 하나의 매개변수를 가져야 한다
- infix 키워드로 정의
 */

fun main() {

    // 일반 표현법
    //val multi = 3.multiply(10)

    // 중위 표현법
    val multi = 3 multiply 10 //읽기 쉬운 경우에만 추천
    println("multi: $multi")
}

// Int를 확장해서 multiply를 하나 더 추가되었음
infix fun Int.multiply(x: Int): Int {
    return this * x
}
