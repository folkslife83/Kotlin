package com.example.tutorials.acmicpc.B11720

fun main()  {
    //val n = readLine()?.toString() ?: "0"
    //val str = readLine()?.toString() ?: "0"
    var str = "10987654321"
    val lst = str.chunked(1)
    var sum = 0
    for (i in lst){
        sum += i.toInt()
    }
    println(sum)

    //println(Integer.parseInt(str))
}


