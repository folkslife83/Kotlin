package com.example.tutorials.Dimo.Observer3

import java.lang.Integer.min
import java.util.*

interface Observer {
    abstract fun update()
}

abstract class Subject {
    private val observers: MutableList<Observer> = mutableListOf()
    fun attach(observer: Observer){
        observers.add(observer)
    }

    fun detach(observer: Observer) {
        observers.remove(observer)
    }
    // 통보 대상 목록, 즉 각 옵저버에게 변경을 통보
    fun notifyObserver() {
        observers.forEach {o ->
            o.update()
        }
    }
}

class ScoreRecord : Subject() {
    private val scores: MutableList<Int> = mutableListOf()
    fun addScore(score: Int) {
        scores.add(score)
        notifyObserver()
    }

    fun getScoreRecord() : MutableList<Int> = scores
}


class DataSheetView(private val scoreRecord: ScoreRecord, private val viewCount: Int) : Observer {
    // 통보 받음
    override fun update() {
        val record = scoreRecord.getScoreRecord()
        displayScores(record, viewCount)
    }
    // 변경 통보 시 리스트 목록 출력
    fun displayScores(record: MutableList<Int>, viewCount: Int) {
        println("list of $viewCount entries: ")
        for(i in  0 until min(record.size, viewCount)) {
            println(record[i])
        }
        println()
    }
}

class MinMaxView(private val scoreRecord: ScoreRecord) : Observer {
    // 통보 받음
    override fun update() {
        val record = scoreRecord.getScoreRecord()
        displayMinMax(record)
    }
    // 변경 통보 시 최소값, 최대값 출력
    fun displayMinMax(record: MutableList<Int>) {
        val minValue = Collections.min(record, null)
        val maxValue = Collections.max(record, null)
        println("Min: $minValue , Max : $maxValue")
    }
}

// StatisticsView는 Observer를 구현함으로써 통보 대상이 됨
class StatisticsView(private val scoreRecord: ScoreRecord) : Observer {
    // 통보 받음
    override fun update() {
        val record = scoreRecord.getScoreRecord()
        displayStatistics(record)
    }
    // 변경 통보 시 조회된 점수의 합과 평균을 출력함
    fun displayStatistics(record: MutableList<Int>) {
        var sum = 0
        record.forEach { score ->
            sum += score
            val average: Float = (sum / record.size).toFloat()
            println("Sum: $sum, Average: $average")
        }
    }
}

fun client() {
    val scoreRecord = ScoreRecord()

    val dataSheetView = DataSheetView(scoreRecord, 3)
    scoreRecord.attach(dataSheetView)
    val minMaxView = MinMaxView(scoreRecord)
    scoreRecord.attach(minMaxView)

    for(i in 1 until 6) {
        val score = i * 10
        println("adding $score")
        scoreRecord.addScore(score)
    }

    scoreRecord.detach(dataSheetView)
    val statisticsView = StatisticsView(scoreRecord)
    scoreRecord.attach(statisticsView)

    for(i in 1 until 6) {
        val score = i * 10
        println("adding $score")
        scoreRecord.addScore(score)
    }
}

fun main(){
    client()
}
