package com.example.tutorials.acmicpc.B1157

fun main(){
    //var str = readLine()?.toString()?.toUpperCase() ?: "0"
    //var str = "Mississipi".toUpperCase()
    var str = "zZzzasbda".toUpperCase()

    val alphaBet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    //var lst = mutableListOf<Int>() // 오류
    var lst: ArrayList<Int> = ArrayList()
    for (i in 1..26) lst.add(0)
    for (i in str) lst[alphaBet.indexOf(i)]++
    var mx = lst.max()
    if (lst.count{it == mx} == 1) print(alphaBet[lst.indexOf(mx)])
    else print("?")
}
