package com.example.tutorials.Dimo.OverLoad
fun main(){
    read(7)
    read("Thanks")
    deliveryItem("짬뽕")
    deliveryItem("책", 3)
    deliveryItem("노트북", 30, "학교")
    deliveryItem("선물", destination = "병원") //순서상 곤란, 직접 할당
    sum(1,2,3,4)
    println(7 multiply 4)
    println(6 multiply (5))


}
fun read(x: Int){
    println("숫자 $x 입니다")
}
fun read(x: String){
    println(x)
}
//파라미터 없다면 지정된 default 값으로 출력
fun deliveryItem(name: String, count: Int = 1, destination: String = "집"){
    println("${name}, ${count}개를 ${destination}에 배달하였습니다.")
}
//vararg 개수 지정되지 않은 parameter. 다른 parameter 와 함께 사용될경우 제일 마지막에 위치
fun sum(vararg numbers: Int){
    var sum = 0
    for (n in numbers){
        sum += n
    }
    println("sum: $sum")
}
infix fun Int.multiply(x: Int): Int = this * x
//class 안에서 infix 함수 선언할때에는 적용할 클라스가 자기자신이므로 클래스 이름 쓰지 않음.
