package com.example.tutorials.acmicpc.B2908

//fun main(){
//    //var str ="734 893"
//    var str = readLine()?: " "
//    var str2 = ""
//    for (i in str.length -1 downTo 0)  str2 += str[i]
//    var a = str2.split(" ")[0].toInt()
//    var b = str2.split(" ")[1].toInt()
//    val max = if(a>b) a else b
//    print(max)
//}
//
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a: String, b: String) = readLine()
            .split(" ")
            //.map { it }
            .map { it.reversed() }
    println(
            if (a > b) a
            else b
    )

}