package com.example.tutorials.acmicpc.B11654

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = readLine()
            .forEach { println(it.toInt()) }
}

