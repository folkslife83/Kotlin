package com.example.tutorials.basic

fun main() {

    //유사 기능들(함수)의 집합체(객체)

    //1. class - 자동차(시동, 운전), 사람(밥먹는다, 물마신다, 걷는다), 동물(뛴다~), 식물(자란다~)
    //2. data class - set, get

    //1. 코딩
    //2. 호출

    var cls = HelloClass()
    var cls2 = HelloClass(10)

    //java
    //HelloClass cls = new HelloClass()

    println(cls2.age)

    var person = Person(5,"Senti")

    println(person.age)
    println(person.name)

}

class HelloClass {
    var age: Int = 0

    //    init {            // 데이터 초기화 호출되면 일단 값을 바꾼다 값을 넘길수 없다.
//        age = 0
//    }
//
    //def 생성자, 보조 생성자 (Java)
    constructor() // 기본 생성자 //초기화하는 두번째 방법. 값을 넘길수 있다. 이거 지우면 HelloClass() 호출불가
    constructor(age: Int) { //set
        this.age = age
    }//보조 생성자
}

data class Person(var age:Int, val name:String)  // val은 바꿀수 없는값
