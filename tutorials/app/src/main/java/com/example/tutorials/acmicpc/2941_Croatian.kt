package com.example.tutorials.acmicpc.B2941

fun main(){
    //val str = "c=c="
    val str = readLine()?: " "
    var cnt = 0
    var a2 = ""
    var a1 = ""
    for (i in str) {
        cnt++
        when (i.toString()) {
            "=" -> {
                when (a1) {
                    "c", "s" -> cnt--
                    "z" -> if (a2 == "d") cnt = cnt - 2 else cnt--
                }
            }
            "-" -> cnt--
            "j" -> if (a1 == "l" || a1 == "n") cnt--
        }
        a2 = a1
        a1 = i.toString()
    }
    print(cnt)
}