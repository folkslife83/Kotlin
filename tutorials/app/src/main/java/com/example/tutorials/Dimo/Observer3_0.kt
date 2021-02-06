package com.example.tutorials.Dimo.Observer3_0

import java.lang.Integer.min

class ScoreRecord {
    private val scores: MutableList<Int> = mutableListOf()
    private lateinit var dataSheetView: DataSheetView

    fun setDataSheetView(dataSheetView: DataSheetView) {
        this.dataSheetView = dataSheetView
    }

    fun addScore(score: Int) {
        scores.add(score)
        dataSheetView.update()
    }

    fun getScoreRecord() : MutableList<Int> = scores
}

class DataSheetView(private val scoreRecord: ScoreRecord, private val viewCount: Int) {
    fun update() {
        val record = scoreRecord.getScoreRecord()
        displayScores(record, viewCount)
    }

    fun displayScores(record: MutableList<Int>, viewCount: Int) {
        println("list of $viewCount entries: ")
        for(i in  0 until min(record.size, viewCount)) {
            println(record[i])
        }
        println()
    }
}

fun client() {
    val scoreRecord = ScoreRecord()

    val dataSheetView = DataSheetView(scoreRecord, 3)
    scoreRecord.setDataSheetView(dataSheetView)

    for(i in 0 until 6) {
        val score = i * 10
        println("adding $score")
        scoreRecord.addScore(score)
    }
}

fun main(){
    client()
}

