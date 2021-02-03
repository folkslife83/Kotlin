package com.example.tutorials.LambdaFnHighOrder.high

fun main(){
    var result1: Int
    var result2: Int
    // 람다식을 매개변수와 인자로 사용한 함수
    result1 = highOrder({x,y -> x + y}, 10, 20)
    println("result1 is : $result1")

    result2 = highOrder(::sum, 1, 2)
    //sum은 람다식이 아닌 함수이므로 ::sum 으로 써야함.
    //참조에 의한 호출방식
    println("result2 is : $result2")


}

fun highOrder(sum: (Int, Int) -> Int, a: Int, b: Int): Int{
    return sum(a, b)
}

fun sum(a: Int, b:Int): Int = a + b
