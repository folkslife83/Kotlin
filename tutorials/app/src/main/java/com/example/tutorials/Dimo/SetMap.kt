package com.example.tutorials.Dimo.SetMap
//set : 순서x 중복x
fun main(){
    val a = mutableSetOf("귤", "바나나", "키위")
    for (i in a){
        println("${i}")
    }
    a.add("자몽")
    println(a)
    a.remove("바나나")
    println(a)
    println(a.contains("귤"))
    println("-----------------------")
    val b = mutableMapOf("레드벨벳" to "음파음파", "트와이스" to "Fancy", "ITZY" to "ICY")
    for (i in b){
        println("${i.key} : ${i.value}")
    }
    b.put("오마이걸", "번지")
    println(b)
    b.remove("ITZY")
    println(b)
    println(b["레드벨벳"])
}

