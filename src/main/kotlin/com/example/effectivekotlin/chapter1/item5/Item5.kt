package com.example.effectivekotlin.chapter1.item5

class Item5 {
    var a = 5
    fun confirm(){
        assert(a == 4)
        println(a)
    }
}

fun main(){
    val item5 = Item5()
    item5.confirm()
}