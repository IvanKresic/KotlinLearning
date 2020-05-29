package com.ivankresic.kotlinlearning.classes

import java.util.*

/**
 * Created by ivan on 28/05/2020
 */

/**
 * Kotlin doesn't have concept of fields, you can only declare properties
 * */


/**
 * In kotlin it is possible to declare properties in Class constructor as follows
 * and also passing values to constructor
 * Also class body can be empty
 * */
class Customer(val id: Int, var name: String, val yearOfBirth: Int){
    //init is executed when instance of class is created

    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth //custom getter for read only property //Single statement and so =


    var socialSecurityNumber: String = ""
        set(value) {
            if(!value.startsWith("SN")){
                throw  IllegalArgumentException("Social security number should start with SN")
            }
            /**
             * there is no fields in kotlin, but there is backing field of each property that actually holds the value
             * when using custom setter, then kotlin will not automatically set the value
             * */
            field = value
        }

    init {
        name =  name.toUpperCase()
    }


    //Member functions - function inside class - in the end its object oriented
    fun customerAsString(): String {
        return "Id: $id - Name: $name"
    }

}

fun main(args: Array<String>) {

    var customer = Customer(10, "Ivan", 1990) //no 'new' keyword in kotlin

    customer.id
    customer.name
    customer.socialSecurityNumber = "SN1234"

    //calling member function
    println(customer.customerAsString())

    println(customer.name)
    println(customer.age)
    println(customer.socialSecurityNumber)
}