package com.example.tutorials.Dimo.Enum
//enum 클래스 안의 객체들은 관행적으로 대문자로. 객체 선언 끝에 세미콜론 쓰고 함수를 이어 선언
fun main(){
    var state = State.SING
    println(state)

    state = State.SLEEP
    println(state.isSleeping())
    state = State.EAT
    println(state.message)
    println(state.isSleeping())

}
enum class State(val message: String){
    SING("노래를 부릅니다"),
    EAT("밥을 먹습니다"),
    SLEEP("잠을 잡니다");
    fun isSleeping() = this == State.SLEEP
}

