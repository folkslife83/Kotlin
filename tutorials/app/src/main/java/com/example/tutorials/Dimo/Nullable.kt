package com.example.tutorials.Dimo.Nullable
// ?. null safe operator 실행방지 // ?: elvis operator 대체// !!. non-null assertion operator 의도적 방치
fun main(){
    var a: String? = null
    var b: String? = "Kotlin Exam"
    println(a?.toUpperCase())
    println(a?:"default".toUpperCase())
    // println(a!!.toUpperCase()) // 에러
    a?.run {
        println(toUpperCase())
        println(toLowerCase())
    }
    // null 체크하기 위해 if문 대신 사용하면 편리
    b?.run {
        println(toUpperCase())
        println(toLowerCase())
    }
}




