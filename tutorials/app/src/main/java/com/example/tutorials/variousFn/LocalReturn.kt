package com.example.tutorials.variousFn.LocalReturn


fun main() {
    shortFunc(3) {
        println("First call: $it")
        return  // 의도하지 않은 반환, 비지역반환
    }
}

inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")  // 이 문장은 실행되지 않음
}