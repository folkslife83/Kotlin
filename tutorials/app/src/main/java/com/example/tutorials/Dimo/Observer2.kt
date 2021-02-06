package com.example.tutorials.Dimo.Observer2

//https://www.baeldung.com/kotlin/observer-pattern
//This method will execute every time a change happens within the object we’re observing.
interface IObserver {
    fun update()
}
//IObservable : responsible for holding the information about all of the observers and sending update events to them
interface IObservable {
    val observers: ArrayList<IObserver>

    fun add(observer: IObserver) {
        observers.add(observer)
    }

    fun remove(observer: IObserver) {
        observers.remove(observer)
    }

    fun sendUpdateEvent() {
        observers.forEach { it.update() }
    }
}

class BaeldungNewsletter : IObservable {
    override val observers: ArrayList<IObserver> = ArrayList()
    var newestArticleUrl = ""
        set(value) {
            field = value
            sendUpdateEvent()
        }
}

class BaeldungReader(private var newsletter: BaeldungNewsletter) : IObserver {
    override fun update() {
        println("New Baeldung article: ${newsletter.newestArticleUrl}")
    }
}
/**
 *
class BaeldungNewsletter {
    val newestArticleObservers = mutableListOf<(String) -> Unit>()

    var newestArticleUrl: String by Delegates.observable("") { _, _, newValue ->
        newestArticleObservers.forEach { it(newValue) }
    }
}
val newsletter = BaeldungNewsletter()
newsletter.newestArticleObservers.add { newestArticleUrl ->
    println("New Baeldung article: ${newestArticleUrl}")
}

*/