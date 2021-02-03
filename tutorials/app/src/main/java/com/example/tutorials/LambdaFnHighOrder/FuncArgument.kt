package com.example.tutorials.LambdaFnHighOrder.Func //중복된 함수 이름때문에 에러날경우 .anyname 추가

fun sum(a: Int, b: Int) = a + b
fun mul(a: Int, b: Int) = a * b

fun main() {
    val result = sum(10, 3)
    val result2 = mul(sum(3,3), 2)
    println("result: $result, result2: $result2")
    println(funcFunc())
}

fun funcFunc(): Int{
    return sum(2,2)
}