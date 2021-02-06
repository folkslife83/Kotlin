package com.example.tutorials.variousFn

import java.math.BigInteger

fun main() {
    val number = 4
    val result: Long

    result = factorial(number)
    println("Factorial: $number -> $result")
    println(getFibo(15, BigInteger("0"), BigInteger("1")))
}

fun factorial(n: Int): Long {
    return if (n == 1) n.toLong() else n * factorial(n - 1)
}
fun getFibo(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    if (n == 0)
        return a
    else
        return getFibo(n-1, b, a+b)
}