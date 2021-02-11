package com.example.tutorials.acmicpc.B5622

fun main(){
    val dial = listOf("ABC","DEF","GHI","JKL","MNO","PQRS", "TUV", "WXYZ")
    val str = readLine()?: " "
    var cnt = 0
    for (i in str){
        cnt += dial.indexOf((dial.find { it.contains(i) })) + 3
    }
    print(cnt)
}



