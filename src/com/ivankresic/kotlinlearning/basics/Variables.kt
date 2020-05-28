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


    val myLong = 10L
    val myFloat = 100F
    val myHex = 0x0F
    val myBinary = 0xb01


    /**
     * In Kotlin there is no kind of explicit number conversion
     * It's not possible to write:
     *
     *  val myInt = 10
     *  val myLongAgain: Long = myInt  !!!!
     *
     *  but there are methods for explicit conversion
     *  val myLongAgain: Long = myInt.toLong()
     * */


    //Strings

    val myChar = 'A'
    val myString = "My String"
    val escapeCharacters = "A new link \n"
    val multilineString = """This is first line
                             This is second line
                          """

    //Kotlin provides string interpolation using $ sign
    val years = 10
    val message = "Decade is $years years"

    //Using curly bracets in interpolation. Also methods like 'if' can be placed inside interpolation
    val name = "Ivan"
    val messageLength = "Length of the name is: ${name.length}"


}