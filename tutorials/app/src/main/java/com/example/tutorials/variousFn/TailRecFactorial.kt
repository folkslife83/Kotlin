package com.example.tutorials.variousFn
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
}

tailrec fun factorial(n: Int, run: Int = 1): Long {
    return if (n == 1) run.toLong() else factorial(n-1, run*n)
}
