package com.example.tutorials.LambdaFnHighOrder

fun main(){
    // 매개변수 없는 람다식 함수
    noParam({"PrintMe1_"}) // lambdaFunction.kt 26줄 참고
    noParam(){"PrintMe2_"}
    noParam{"PrintMe3"}  //소괄호 생략 가능
    println("")
    // 매개변수 1개
    oneParam({a -> "1_$a" })
    oneParam {a -> "2_$a" }
    oneParam {"3_$it" } //it 으로 대체 가능
    println("")
    // 매개변수 2개
    twoParam{a,b -> "PrintMe! $a $b"} //it 으로 생략 불가
    twoParam{_, b -> "PrintMe! $b"} // 첫번째 문자열을 사용하지 않고 생략 _ 이용
    //인자와 함께 사용
    withArgs("Arg1", "Arg2", {a,b -> "PrintMe! $a $b"})
    withArgs("Arg1", "Arg2") {a,b -> "PrintMe! $a $b"} //람다식이 마지막이면 빼낼수 있다.


}

fun noParam(out: () -> String) = print(out())
fun oneParam(out: (String) -> String){
    print(out("oneParam_"))
}
fun twoParam(out: (String, String) -> String) {
    println(out("p1", "p2"))
}
fun withArgs(a: String, b: String, out: (String, String) -> String){
    println(out(a, b))
}
