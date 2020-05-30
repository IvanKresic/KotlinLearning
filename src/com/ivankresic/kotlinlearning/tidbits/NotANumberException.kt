package com.ivankresic.kotlinlearning.tidbits

/**
 * Created by ivan on 30/05/2020
 *
 * Base class for exceptions in Kotlin is Throwable
 */
class NotANumberException(message: String) : Throwable(message) {


}

fun checkIsNumber(obj: Any){
    when(obj){
        !is Int, Long, Float, Double -> throw NotANumberException("This is not a number!") //multiple conditions in a single line
    }
}

fun main(args: Array<String>) {

    try {
        checkIsNumber("A")
    }
    catch (e: IllegalArgumentException){
        println("Do nothing")
    }
    catch (e: NotANumberException){
        println(e.message)
    }


}