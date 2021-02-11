package com.example.tutorials.acmicpc.B1316

fun main(){
    var cnt = 0
    val n = readLine()?.toInt()?:0
    for (i in 1..n){
        var str = readLine()?.toString() ?: "0"
        if (g(one(str))) cnt++
    }
    print(cnt)

}

fun g(str:String):Boolean{
    for (i in str){
        var lns = str.split(i)
        if(lns.size > 2) return false
    }
    return true
}

fun one(str: String):String{
    var ans=""
    var add=""
    for (i in str) {
        if (add != i.toString()) ans += i.toString()
        add = i.toString()
    }
    return ans
}

