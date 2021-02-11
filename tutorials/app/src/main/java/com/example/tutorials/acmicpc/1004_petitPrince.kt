package com.example.tutorials.acmicpc.B1004
import java.io.BufferedReader
import java.io.InputStreamReader
//원 안에 두 점중 하나만 포함.
//런타임에러

fun main()= with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = kotlin.io.readLine()?.toInt()?:0
    for (i in 1..n){
        val (a: String, b: String, c: String, d: String) = readLine()
                .split(" ")
                .map { it }
        val st1 = StAr(a.toInt(), b.toInt())
        val st2 = StAr(c.toInt(), d.toInt())

        val m = kotlin.io.readLine()?.toInt()?:0
        var cnt = 0
        for (j in 1..m){
            val (p: String, q: String, r: String) = readLine()
                    .split(" ")
                    .map { it }
            val planet = Planet(p.toInt(), q.toInt(), r.toInt())
            if(inOut(st1, planet).xor(inOut(st2, planet))) cnt++
        }
        println(cnt)
    }
}

fun inOut(stAr: StAr, planet: Planet):Boolean{
    return distSq(stAr.x, stAr.y, planet.cx, planet.cy) < planet.r * planet.r
}

fun distSq(x1:Int,y1:Int,x2:Int,y2:Int):Int{
    return (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)
}
class StAr(val x:Int,val y:Int)
class Planet(val cx:Int, val cy:Int, val r:Int)


//import kotlin.math.*
//fun main()= with(BufferedReader(InputStreamReader(System.`in`))) {
//    val n = kotlin.io.readLine()?.toInt()?:0
//    for (i in 1..n){
//        val (a: String, b: String, c: String, d: String) = readLine()
//                .split(" ")
//                .map { it }
//        val st1 = StAr(a.toDouble(), b.toDouble())
//        val st2 = StAr(c.toDouble(), d.toDouble())
//
//        val m = kotlin.io.readLine()?.toInt()?:0
//        var cnt = 0
//        for (j in 1..m){
//            val (p: String, q: String, r: String) = readLine()
//                    .split(" ")
//                    .map { it }
//            val planet = Planet(p.toDouble(), q.toDouble(), r.toDouble())
//            if(inOut(st1, planet).xor(inOut(st2, planet))) cnt++
//        }
//        println(cnt)
//    }
//}
//
//fun inOut(stAr: StAr, planet: Planet):Boolean{
//    return distSq(stAr.x, stAr.y, planet.cx, planet.cy) < planet.r
//}
//
//fun distSq(x1:Double,y1:Double,x2:Double,y2:Double):Double{
//    return hypot((x1-x2) ,  (y1-y2))
//}
//class StAr(val x:Double,val y:Double)
//class Planet(val cx:Double, val cy:Double, val r:Double)