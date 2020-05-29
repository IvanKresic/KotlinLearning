package com.ivankresic.kotlinlearning.classes

/**
 * Created by ivan on 29/05/2020
 */


/**
 * This is not just global object, it's a singleton
 * */
object Global {
    val Pi = 3.14
}

fun main(args: Array<String>) {


    // object declarations are initialized in a lazy way
    // expressions like below are initialized immediately when they are used
    val localObject = object {
        val Pi = 3.14
    }

    println(localObject.Pi)

    println(Global.Pi)
}