package com.example.tutorials.Dimo.Bit
//실무에서는 경제성을 높이기 위해 활용. 주로 플래그값(여러 상태값을 0과 1로 담는 방법). 네트워크에서 프로토콜 데이터 줄이기
//Kotlin 에서 모든 정수형이 최상위 비트는 부호.
fun main(){
    var bitData:Int = 0b10000
    bitData = bitData or (1 shl 2) //좌측으로 2번 밀기 // shl 부호비트 제외 좌측으로 1칸씩 밀어줌
    println(bitData.toString(2)) // 2진수 형태 문자열로 변경
    var result = bitData and(1 shl 4)
    println(result.toString(2))
    println(result shr 4) // shr 부호비트 제외 우측으로 1칸씩 밀어줌 ushr 부포비트포함
    bitData = bitData and((1 shl 4).inv())
    println(bitData.toString(2))
    println((bitData xor(0b10100)).toString(2))

}

