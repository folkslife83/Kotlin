package com.example.tutorials.Dimo.Observer

fun main(){
    EventPrinter().start() //인스턴스 생성 후 함수 호출
}
//인터페이스가 벨 역할. Observer (Kotlin 에선 listener)
interface EventListener{
    fun onEvent(count: Int) //추상함수
}
//이벤트 발생 및 전달. Printer 호출 불가. 인터페이스 이용(벨을 울린다)
class Counter(var listener: EventListener){
    fun count(){
        for(i in 1..100){
            if(i%5 == 0) listener.onEvent(i)
        }
    }
}

//익명객체 활용
class EventPrinter{
    fun start(){
        val counter = Counter(object: EventListener{
            override fun onEvent(count: Int){
                print("${count}-")
            }
        })
        counter.count()
    }
}

/**
//이벤트를 수신. Counter 직접 수신. 벨을 만들어둔다.
class EventPrinter: EventListener{
    override fun onEvent(count: Int) {
        print("${count}-")
    }
    fun start(){
        val counter = Counter(this) //this는 객체 자신을 나타내지만 다형성에 의해 EventListener 구현부만 넘겨줌
        counter.count()
    }
}

 */

