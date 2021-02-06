package com.example.tutorials.variousFn.tailrec

import com.example.tutorials.variousFn.getFibo
import java.math.BigInteger

/**
재귀 함수의 필수 조건
- 무한 호출에 빠지지 않도록 탈출 조건을 만들어 둔다
- 무한 호출에 빠지는 경우 Stack Overflow가 발생할수 있다
- 스택 영역을 이용하므로 호출 회수를 무리하게 지정하지 않는다
- 코드를 복잡하지 않게 한다
 */

fun main() {
    val number = 5
    println("Factorial: $number -> ${factorial(number)}")
    println(getFibo2(10000, BigInteger("0"), BigInteger("1")))

}

tailrec fun factorial(n: Int, run: Int = 1): Long {
    return if (n == 1) run.toLong() else factorial(n-1, run*n)
}

tailrec fun getFibo2(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    if (n == 0)
        return a
    else
        return getFibo2(n-1, b, a+b)
}