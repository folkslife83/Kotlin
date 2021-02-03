package com.example.tutorials.LambdaFnHighOrder

fun main(){
    val result = callByName(lambda2)
    println(result)
}

fun callByName(b:() -> Boolean): Boolean{
    println("callByName function")
    return b() //람다식은 여기서 호출됨. 즉시 실행할필요없는경우
}

val lambda2: () -> Boolean ={
    println("lambda2 function")
    true

}