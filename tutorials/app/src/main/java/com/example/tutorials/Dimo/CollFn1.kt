package com.example.tutorials.Dimo.CollFn1

fun main(){
    val nameList = listOf("박수영","김지수","김다현","신유나","김지우")
    nameList.forEach{ print(it + " ")}
    println(nameList.filter { it.startsWith("김") })
    println(nameList.map { "이름: " + it})
    println(nameList.any { it == "김지연" })
    println(nameList.all { it.length == 3 })
    println(nameList.none { it.startsWith("이") })
    println(nameList.first { it.startsWith("김") })
    println(nameList.last { it.startsWith("김") })
    println(nameList.count { it.contains("지") })
    println(nameList.firstOrNull { it.startsWith("최") })
    println(nameList.lastOrNull { it.endsWith("현") })

}
