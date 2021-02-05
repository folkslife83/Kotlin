package com.example.tutorials.variousFn.crossinline

fun main() {
    shortFunc(3) {
        println("First call: $it")
        // return 사용 불가
    }
}
//crossline으로 reutrn 금지
inline fun shortFunc(a: Int,  crossinline out: (Int) -> Unit) {
    println("Before calling out()")
    nestedFunc { out(a) }
    println("After calling out()")
}

fun nestedFunc(body: () -> Unit) {
    body()
}