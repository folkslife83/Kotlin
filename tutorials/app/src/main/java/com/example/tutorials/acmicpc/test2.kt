package com.example.tutorials.acmicpc.test2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a: String, b: String) = readLine()
            .split(" ")
            .map { it }

    println(a.toInt() + b.toInt())

}