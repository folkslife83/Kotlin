package com.example.tutorials.Dimo.LateLazy
//lateinit 기본 자료형에는 사용 불가. String 클래스에는 사용 가능
//lazy delegate properties 변수를 사용하는 시점까지 자동으로 초기화를 늦춤. 코드 실행시간을 최적화.람다함수. 마지막구문 리턴
fun main(){
    val a = LateInitSample()
    println(a.getLateInitText())
    a.text = "new Value"
    println(a.getLateInitText())
    println("-------------------------------")

    val number: Int by lazy {
        println("초기화를 합니다")
        7
    }
    println("코드를 시작합니다")
    println(number)
    println(number) //이미 초기화를 했기에 초기화 구문을 실행하지 않음
}
class LateInitSample{
    lateinit var text: String
    fun getLateInitText(): String{
        //lateinit 변수가 초기화 되었는지 확인
        if (::text.isInitialized){
            return text
        } else {return "default"}
    }
}

