package com.example.tutorials.acmicpc.B4673

fun main(){
    val ansLst = mutableListOf<Int>()
    for (i in 1..10000){
        ansLst.add(i)
    }
    for (i in 1..10000){
        ansLst?.remove(d(i))
    }
    for (i in ansLst)    println(i)

}

fun d(n: Int):Int{
    var sum = 0
    var m : Int
    m = n
    while (m > 0){
        sum += m%10
        m /= 10
    }
    return sum + n
}

