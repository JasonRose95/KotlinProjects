package com.example.kotlinbasics

fun main(){
avg()
}
fun avg(){
    var fiveNumbers = arrayListOf<Double>()
    fiveNumbers.add(5.1)
    fiveNumbers.add(6.2)
    fiveNumbers.add(7.2)
    fiveNumbers.add(7.7)
    fiveNumbers.add(8.9)
    for(number in fiveNumbers){
        var sum = 0.0
        sum += number
        print ("${sum /fiveNumbers.size}")
    }
}