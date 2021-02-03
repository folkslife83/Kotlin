package com.example.tutorials.LambdaFnHighOrder

fun main(){
    val res1 = funcParam(3,2, ::sum)
    println(res1)
    val res2 = funcParam(3,2, ::mul)
    println(res2)

    hello(::text)

    val likeLambda = ::sum
    println(likeLambda(5,6))

}

fun sum(a: Int, b: Int) = a + b
fun mul(a: Int, b: Int) = a * b
fun text(a: String, b: String) = "Hi! $a $b"

fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int{
    return c(a, b)
}

fun hello(body: (String, String) -> String): Unit{      //인자가 람다식, 그 람다식을 body로 명명
    println(body("Hello", "World"))                     //위에서 호출할때 람다식 body는 이경우 ::text
}
