package com.ivankresic.kotlinlearning.basics

/**
 * Created by ivan on 28/05/2020
 */

fun main(args: Array<String>) {

    //for a of type integer that goes from 1 to 100
    //.. is replacement operator for rangeTo
    for(a: Int in 1..100){
        println(a)
    }


    //again, no need for explicit type
    for(a in 1..100){
        println(a)
    }

    val numbers = 1..100  //a list of numbers from 1 to 100

    for (a in numbers){
        println(a)
    }


    //
    for (a in 100 downTo 1){}


    //it is possible to define steps in loop
    for(b in 100 downTo 1 step 5){}

    val capitals = listOf("London", "Berlin", "Pariz", "Neum")
    for (capital in capitals){
        println(capital)
    }


    //in form of loops, kotlin provides possibility to break and continue loops

    loop@ for (i in 1 .. 100){
        for (j in 1 .. 100){
            if(j % i == 0)
                break@loop
            else
                continue
        }
    }

}