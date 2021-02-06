package com.example.tutorials.Dimo.High

fun main(){
    b(::a)
    val c: (String)-> Unit = { str -> println("$str 람다함수") }
    //val c = { str: String -> println("$str 람다함수") } // 위와 같은 기능
    b(c)
}
fun a (str:String){
    println("$str 함수 a")
}
fun b (function: (String)-> Unit){
    function("b가 호출한")
}
