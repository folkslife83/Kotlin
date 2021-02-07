package com.example.tutorials.Dimo.String

import kotlin.reflect.typeOf
fun main(){
    //string()
    //isNull()
    var test3 = "kotlin.kt"
    var test4 = "java.java"
    println(test3.startsWith("java"))
    println(test4.startsWith("java"))
    println(test3.endsWith(".kt"))
    println(test4.endsWith(".kt"))
    println(test3.contains("lin"))
    println(test4.contains("lin"))



}

fun string(){
    val test1 = "Test.Kotlin.String"
    println(test1.length)
    println(test1.toLowerCase())
    println(test1.toUpperCase())
    val test2 = test1.split(".")
    print("${test2.javaClass}_")
    println(test2)
    print("${test2.joinToString().javaClass.name}_")
    println(test2.joinToString())
    println(test2.joinToString().substring(3..7))
    println(test2.joinToString("-"))
    println(test1.substring(5..10))
}

fun isNull(){
    val nullString: String? = null
    val emptyString = ""
    val blankString = " "
    val normalString = "A"
    println(nullString.isNullOrEmpty())  //null 여부만 체크
    println(emptyString.isNullOrEmpty())
    println(blankString.isNullOrEmpty())
    println(normalString.isNullOrEmpty())
    println()
    println(nullString.isNullOrBlank())  // null 이거나 blank
    println(emptyString.isNullOrBlank())
    println(blankString.isNullOrBlank())
    println(normalString.isNullOrBlank())


}