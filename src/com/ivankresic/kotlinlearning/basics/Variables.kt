package com.ivankresic.kotlinlearning.basics

/**
 * Created by ivan on 26/05/2020
 */

fun main(args: Array<String>) {


    /**
     * "var" is not dynamic type. If declared as integer, it will request integer assignemt
     * It is mutable variable - it is possible to change the value
     * */

    var streetNumber: Int //Uninitialized
    var streetName: String = "High street"  //Initialized at declare
    var streetName2 = "High street"  //Kotlin uses inference to recognize that this is of type String
                                     //Does not have to define type


    /**
     * "val" is immutable variable - read only. Once initialized, value can't be changed
     * */
    val zip = "10 000 Zagreb"

    //Now it is impossible to reassign this variable. So can't say: zip = "21 000 Split"

    /**
     * In Kotlin Int, Byte, Double, Float are objects, not primitive types
     * */
}