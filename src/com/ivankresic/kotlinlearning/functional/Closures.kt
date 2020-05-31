package com.ivankresic.kotlinlearning.functional

/**
 * Created by ivan on 31/05/2020
 */


/**
 * Here we access value of an outside variable from unary operation lambda expression
 * */
fun outsideFunction(){
    val number = 10
    unaryOperation(20) { x -> x * number}

    for (number2 in 1 .. 30){
        unaryOperation(20) { x ->
            println(number2)
            x * number2
        }
    }

}

fun main(args: Array<String>) {

}