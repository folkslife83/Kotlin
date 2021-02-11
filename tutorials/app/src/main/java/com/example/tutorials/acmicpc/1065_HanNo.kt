package com.example.tutorials.acmicpc.B1065


fun main(){
    var n = readLine()?.toIntOrNull() ?: 0
    var cnt = 0
    for (i in 1..n){
        if (d(i)) cnt++
    }
    println(cnt)


}

fun d(n: Int):Boolean{
    if (n < 100) return true
    var m : Int
    m = n

    var diff = (m/10)%10 - m%10

    while (m >= 10){
        if (diff != (m/10)%10- m%10) return false
        else m /= 10
    }
    return true
}



