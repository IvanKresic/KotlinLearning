package com.ivankresic.kotlinlearning.basics

/**
 * Created by ivan on 28/05/2020
 */

fun main(args: Array<String>) {
    var myString = "Not empty"


    //condition can return type of Any - that means in one condition can return Integer, and in another one String
    /*val result = if(myString != "") {
        println("Not empty")
        20
    }
    else {
        "Empty"
    }
    println(result)
    */

    val result = if(myString != ""){
        "Not empty"
    }else{
        "Is empty"
    }

    //When is the equivalent to the switch
    //Result also can be assigned to the variable
    var whenResult = when(result){
        "Value" -> {
            println("It's a value")
            println("It's a second statement")
            "Returning from first when case"
        }
        is String -> println("Excelent")
        else -> println("It came to this!") //same as in if block, when assigned to variable, he needs two know what to assign
    }                                       //when first condition is not fulfilled
    println(whenResult)
}