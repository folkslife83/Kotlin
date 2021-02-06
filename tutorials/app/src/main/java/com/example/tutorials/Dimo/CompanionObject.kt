package com.example.tutorials.Dimo
//Companion Object 기존 클래스 안에 오브젝트. 인스턴스간의 공용 속성 및 함수
//기존 언어의 Static 멤버와 비슷 = 클래스 내부에 별도영역에 고정적으로 존재, 인스턴스 생성하지 않아도 공용으로 사용 가능

fun main(){
    var a = FoodPoll("짜장")
    var b = FoodPoll("짬뽕")
    a.vote()
    a.vote()
    b.vote()
    b.vote()
    b.vote()

    println("${a.name} : ${a.count}")
    println("${b.name} : ${b.count}")
    println("총계 : ${FoodPoll.total}")



}
class FoodPoll (val name: String){
    companion object{
        var total = 0
    }
    var count = 0
    fun vote(){
        total++
        count++
    }
}
