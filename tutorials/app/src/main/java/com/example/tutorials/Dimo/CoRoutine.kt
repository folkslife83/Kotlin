package com.example.tutorials.Dimo.CoRoutine
//GlobalScope 프로그램 어디서나 제어, 동작이 가능한 기본 범위
//CoroutineScope 특정한 목적의 Dispatcher 를 지정하여 제어 및 동작이 가능한 범위. 지원되는 플랫폼에 따라 사용
//Dispatchers.Default 기본적인 백그라운드 동작
//Dispatchers.IO  I/O에 최적화된 동작
//Dispatchers.Main 메인(UI)스레드에서 동작
//Android 프로젝트에서 코루틴을 사용하려면 앱의 build.gradle(Module) 파일에 다음 종속 항목을 추가합니다.
//dependencies {
//    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9'
//}
import kotlinx.coroutines.*

fun main(){
    /**
    val scope = GlobalScope //coroutine 실행될때까지 기다리지 않아서 작동 x
    scope.launch {
        for (i in 1..5){
            println(i)
        }
    }
    */
//Android 에서 main 스레드에서 runBlocking 을 걸어주면 일정시간 이상 응답 없을경우 ANR 앱 자동종료
//launch 반환값이 없는 Job객체 // async 반환값이 있는 Deffered 객체 // 람다함수 형태ㅡ async경우 마지막에 반환

    //until()
    runBlocking {
        var result = withTimeoutOrNull(2100){
            for (i in 1..10){
                println(i)
                delay(500)
            }
            "finish"
        }
        println(result)
    }



}
fun until(){
    runBlocking {
        val a = launch {
            for (i in 1..5){
                println(i)
                delay(500) // milisecond 단위로 루틴 잠시 대기 //대략 5밀리초 이상이 되면 1만 남음
            }
        }
        val b = async { "async 종료" }
        println("async 대기")
        println(b.await()) // Deferred.await() Deferred 실행이 끝날때까지 대기. await()는 Deferred결과도 반환

        println("launch 대기")
        a.join() // Job.join() Job의 실행이 끝날때까지 대기하는 함수
        //println("launch 취소") 위 두줄을 아래 두줄로 바꾸면 추가숫자 안세고 종료
        //a.cancel() //

        println("launch 종료")
    }
}






