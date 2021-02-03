package com.example.tutorials.basic

fun main() {
    //map - key, value pair JSON name! senti (value) "~","~","~"
    //{"name":"senti"}



    var map1 = mapOf(Pair("name","senti")) // 수정불가능

    var map2 = mutableMapOf<String, String>() //type  , 수정가능
    map2.put("name","senti")
    map2.put("age", "1")

    //keys
    print(map2.keys)
    print("\n")
    print(map2.values)
    print("\n")

    for(map in map2) {
        print(map.key)
        print(":")
        print(map.value)
        println("")

    }

    //nullable, not null

}