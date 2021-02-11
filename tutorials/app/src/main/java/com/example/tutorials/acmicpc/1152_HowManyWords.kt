package com.example.tutorials.acmicpc.B1152

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
//
//fun main()= with(BufferedReader(InputStreamReader(System.`in`))) {
//    StringTokenizer(readLine()).run { print(this.countTokens()) }
//}


fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    print(StringTokenizer(readLine(), " ").countTokens())
}