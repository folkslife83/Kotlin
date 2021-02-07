package com.example.tutorials.Dimo.CollFn2

fun main(){
    //agp()
    val numbers = listOf(-3,7,2,-10,1)
    println(numbers.flatMap { listOf(it*10, it+10) })
    println(numbers.getOrElse(4){777})
    println(numbers.getOrElse(10){777})
    val names = listOf("A","B","C","D")
    println(names zip numbers)

}

fun agp(){
    data class Person(val name:String, val birthYear: Int)
    val personList = listOf(Person("유나", 1992 ),
            Person("조이", 1996 ),
            Person("츄", 1999 ),
            Person("유나", 2003 ))
    println(personList.associateBy { it.birthYear })
    println(personList.groupBy { it.name })
    val (over98, under98) = personList.partition { it.birthYear > 1998 }
    println(over98)
    println(under98)
}

