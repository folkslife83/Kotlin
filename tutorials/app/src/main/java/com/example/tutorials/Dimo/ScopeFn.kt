package com.example.tutorials.Dimo.ScopeFn

fun main(){
    var a = Book("Folkslife's New Book", 10000).apply {
        name = "[초특가_]" + name
        discount()
    }
    a.run {
        println("상품명: ${name}, 가격: ${price}원")
    }
//    with(a){
//        println("상품명: ${name}, 가격: ${price}원")
//    }
}

class Book(var name: String, var price: Int){
    fun discount(){
        price -= 2000
    }
}

