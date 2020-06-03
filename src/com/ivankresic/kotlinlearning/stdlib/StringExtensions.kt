package com.ivankresic.kotlinlearning.stdlib

import java.io.File

/**
 * Created by ivan on 03/06/2020
 */

fun main(args: Array<String>) {
    /*
    * There is a lot of extension functions for String in Kotlin
    * It is advised to check on them before doing any custom extension functions
    * */

    val file = File("filename.txt")
    if(file.isAbsolute){
        //..
        file.name
        file.absoluteFile
    }

    /*
    * In Kotlin there is easier way of doing it like above when stating "file" each time using function "with"
    * */

    /**
     * Calls the specified function [block] with the given [receiver] as its receiver and returns its result.
     */
    with(file){
        name
        absoluteFile
    }

    val string: String? = "Some value"


    /**
     * Calls the specified function [block] with `this` value as its argument and returns its result.
     */
    /*
    * Let is usefull with potencially nullable values. Using let here we can access properties of a variable
    * */
    string?.let {
        string.length
    }

}