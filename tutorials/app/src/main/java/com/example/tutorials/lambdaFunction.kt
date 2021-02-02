package com.example.tutorials

fun main() {
    var result1 : Int
    var result2 : Int
    var result3 : Int
/**
    val multi = {x: Int, y: Int -> x * y}  // (불변)변수에 지정된 람다식 선언자료형 생략
    // val multi: (Int, Int) -> Int = {x, y -> x * y} // 람다식 매개변수 자료형 생략
    result1 = multi(10,20)
    result2 = multi(2,3)
    println("result1 is: " + result1)
    println("result2 is: " + result2)

    val multi2: (Int, Int) -> Int = {x: Int, y: Int -> x * y} // 생략하지 않은 형식
    result3 = multi2(22,4)
    println("result3 is: " + result3)
*/
    val multi3: (Int, Int) -> Int = {x: Int, y: Int ->
        println("x * y")
        x * y               //람다식에서 마지막 표현식이 반환된다
}
    result1 = multi3(6,7)
    println(result1) //실행 안할경우 multi3 의 "x * y"만 실행, 출력된다, 실행할경우 곱셈결과도 출력

    val greet: () -> Unit = { println("Hello World!")} // 반환자료형이 없는경우
    // val greet = { println("Hello World!")} //추론 가능
    val square: (Int) -> Int = {x -> x*x} //매개변수가 하나인 경우
    greet()

    println(square(7))


    val nestedLambda: ()->()->Unit = {{ println("nested")}} // 람다식 안에 람다식
    // val nestedLambda = {{ println("nested")}} // 추론가능
    nestedLambda()()  //nestedLambda 의 호출 방식

    val nestedLambda2: ()->(x:Int)->Int = {{ 20}} // 람다식 안에 람다식
    val nested = nestedLambda2()(3)
    println(nested)



    
    








}