package com.example.tutorials.acmicpc.B2675

fun main(){
    val n = readLine()?.toInt()?:0
    for (i in 1..n){
        var str = readLine()?.toString() ?: "0"
        var lns = str.split(" ")
        println(iter(lns[0].toInt(), lns[1]))
    }
}
fun iter(n:Int, st:String):String{
    var ans = ""
    for (i in st){
        for (j in 1..n){
            ans += i
        }
    }
    return ans
}
