package com.example.tutorials.Dimo

//class 생성자 - 기본, 보조 init, constructor

fun main(){
    var a = Person("박보영", 1990)
    var b = Person("전정국", 1997)
    var c = Person("장원영", 2004)
    
    var d = Person("이루다")
    var e = Person("류수정")

}
class Person (var name: String, val birthYear: Int){
    init {
        println("${this.birthYear}년생 ${this.name}님이 생성되었습니다.")
    }
    constructor(name: String) : this(name, 1997){
        println("보조 생성자가 사용되었습니다.")
    }
}