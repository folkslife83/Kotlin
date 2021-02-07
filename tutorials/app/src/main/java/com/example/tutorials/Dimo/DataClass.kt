package com.example.tutorials.Dimo.Data
//equals(), hashcode(), toString(), copy(),componentX() 자동구현
fun main(){
    //copy()
    //compX()
}
fun copy(){
    val a = General("folks", 212)
    println(a == General("folks", 212))
    println(a.hashCode())
    println(a)
    println()
    val b = Data("life", 306)
    println(b == Data("life", 306))
    println(b.hashCode())
    println(b)
    println()
    println(b.copy())
    println(b.copy().hashCode())
    println(b.copy("style"))
    println(b.copy(id=618))
}
fun compX(){
    val list = listOf(Data("folks", 212),
            Data("life", 306),
            Data("style", 618))
    for ((a, b) in list){
        println("${a}, ${b}")
    }
}
class General(val name:String, val id:Int)
data class Data(val name: String, val id: Int)



