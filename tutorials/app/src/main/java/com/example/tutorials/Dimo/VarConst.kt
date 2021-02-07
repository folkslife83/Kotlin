package com.example.tutorials.Dimo.VarConst
//val 은 할당된 객체를 바꿀 수 없을뿐 객체 내부 속성은 변경 가능
//const val 은 상수ㅡ 변경 불가. 대문자와 언더바만 사용 - 객체 생성 없어 성능면에서 변수보다 우수
fun main(){
    var foodCourt = FoodCourt()
    foodCourt.searchPrice(FoodCourt.FOOD_CREAM_PASTA)
    foodCourt.searchPrice(FoodCourt.FOOD_STEAK)
    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)
}
class FoodCourt{
    fun searchPrice(foodName: String){
        val price = when(foodName){
            FOOD_CREAM_PASTA -> 13000
            FOOD_STEAK -> 25000
            FOOD_PIZZA -> 15000
            else -> 0
        }
        println("${foodName}의 가격은 ${price}원 입니다")
    }
    companion object{
        const val FOOD_CREAM_PASTA = "크림파스타"
        const val FOOD_STEAK = "스테이크"
        const val FOOD_PIZZA = "피자"
    }
}




