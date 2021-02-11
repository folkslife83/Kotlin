package com.example.tutorials.acmicpc.B10809

fun main(){
    //var str = "baekjoon"
    var str = readLine()?.toString() ?: "0"

    val alphaBet = "abcdefghijklmnopqrstuvwxy"
    for (i in alphaBet){
        print(str.indexOf(i))
        print(" ")
    }
    print(str.indexOf("z"))
}

//import java.io.BufferedReader
//import java.io.InputStreamReader
//
//fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
//var alphabet: IntArray = IntArray(26) { -1 }
//val str = readLine()
//
//for (i in str.indices)
//if (alphabet[str[i].toInt() - 97] == -1)
//alphabet[str[i].toInt() - 97] = i
//
//alphabet.forEach { print("${it} ") }
//}