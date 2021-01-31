package com.example.tutorials

fun main() {

    var arr1 = listOf("1", "2", "10") // 수정이 안됨  arr1.add 불가
    var arr2 = mutableListOf("3","4") // 수정이 됨 arr2.add 가능
    arr2.add("5")

    for (item in arr1){   // item 대신 i로 써도 됨
        println(item)
    }

    for ((index, i) in arr1.withIndex()){
        println("$index, $i")
    }

    // casting object << String, int, long ... // Any - auto casting
    var hello: Any = "hello"
    if(hello is String){
        // (String) hello; 이런 형변환을 자동으로 if문안에서 해줌
        var str: String = hello
        println(str)
    }

}