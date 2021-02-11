package com.example.tutorials.acmicpc.B14681

fun main(args: Array<String>) = println(
        Int.let {
            val x = n
            val y = n
            when {
                x > 0 -> if (y > 0) 1 else 4
                else -> if (y < 0) 3 else 2
            }
        }
)

val n: Int
    get() = readLine()?.toIntOrNull() ?: 0



