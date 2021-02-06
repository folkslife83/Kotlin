package com.example.tutorials.Dimo.ScopeFn

fun main(){
    var price = 5000
    var a = Book("Folkslife's New Book", 10000).apply {
        name = "[초특가_]" + name
        discount()
    }
    a.run {
        println("상품명: ${name}, 가격: ${price}원")
    //run 함수가 인스턴스내의 price 속성보다 run 이 속한 main 함수의 price 변수를 우선시
    }
// a.run 과 with(a) 는 같은 기능
//    with(a){
//        println("상품명: ${name}, 가격: ${price}원")
//    }
    a.let{
        println("상품명: ${it.name}, 가격: ${it.price}원")
    }
}


class Book(var name: String, var price: Int){
    fun discount(){
        price -= 2000
    }
}
//처리가 끝나면 인스턴스를 반환 apply / also
//처리가 끝나면 최종값을 반환 run / let
//apply, run 은 참조연산자 없이 인스턴스의 변수, 함수 사용
//also, let 은 파라미터로 인스턴스를 넘긴것처럼 it을 통해 인스턴스를 사용 
// 같은 이름의 변수,함수가 scope 바깥에 중복된 경우 혼란 방지 위해