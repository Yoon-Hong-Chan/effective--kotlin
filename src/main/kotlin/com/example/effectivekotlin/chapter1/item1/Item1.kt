package com.example.effectivekotlin.chapter1.item1

class BankAccount{
    var balance = 0.0
        private set
    fun deposit(depositAmount: Double){
        balance += depositAmount
    }

    @Throws(InsufficientFunds::class)
    fun withdraw(withdrawAmount:Double){
        if(balance < withdrawAmount){
            throw InsufficientFunds()
        }
        balance -= withdrawAmount
    }
}

class InsufficientFunds : Exception()

fun item1ThreadTest(){
    var num = 0
    for(i in 1..1000){

    }
}

fun main(){

}