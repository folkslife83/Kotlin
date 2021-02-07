package com.example.tutorials.Dimo.Equality
// 내용의 동일성 vs 객체의 동일성 - 후자는 서로다른 변수가 메모리상의 같은 객체를 가리키고 있는경우
fun main(){
    var a = Product("콜라", 1000)
    var b = Product("콜라", 1000)
    var c = a
    var d = Product("사이다", 1000)

    println(a==b)
    println(a===b)
    println(a==c)
    println(a===c)
    println(a==d)
    println(a===d)
}
//Any - 코틀린 모든 클래스가 내부적으로 상속받는 최상위 클래스. equals 함수 존재. 커스텀 class 만들때 상속 필요
class Product(val name: String, val price: Int){
    override fun equals(other: Any?): Boolean{
        if (other is Product){
            return other.name == name && other.price == price
        } else {
            return false
        }

    }
}

