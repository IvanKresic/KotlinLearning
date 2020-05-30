package com.ivankresic.kotlinlearning.tidbits

/**
 * Created by ivan on 30/05/2020
 */

open class Person{

}

class Employee : Person(){
    fun vacationDays(days: Int){
        if(days < 60){
            println("You need more vacation!")
        }
    }
}

class Contractor: Person(){

}

fun hasVacations(obj: Person){
    if(obj is Employee){
        obj.vacationDays(20) //smart casting to Employee, no need for explicit cast
    }

}

var input: Any = 10

fun main(args: Array<String>) {

    /**
     * Sign '?' here says compiler will try to smart cast variable as String, but will not result in error if it fails
     * */

    val str = input as? String

    println(str?.length)

}