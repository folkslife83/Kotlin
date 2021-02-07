package com.example.tutorials.Dimo.Poly

fun main(){
    var a = Drink()
    a.drink()
    var b: Drink = Cola()
    b.drink()
    // b.washDishes() //에러 발생. is / as 다운캐스팅 필요
    if (b is Cola){       //b가 Cola와 호환되는지 여부 체크
        b.washDishes()
    }
    // b.washDishes() // 에러 발생. is는 조건문안에서만 잠시 다운캐스팅
    var c = b as Cola  //as를 사용하면 반환값 뿐만 아니라 변수 자체도 다운캐스팅됨
    c.washDishes()
    b.washDishes()

    
}
open class Drink{
    var name = "음료"
    open fun drink(){
        println("${name}을 마십니다")
    }
}

class Cola: Drink(){
    var type = "콜라"
    override fun drink(){
        println("${name}중에 ${type}를 마십니다")
    }
    fun washDishes(){
        println("${type}로 설거지를 합니다")
    }
}
