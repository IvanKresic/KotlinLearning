package com.ivankresic.kotlinlearning.functional

/**
 * Created by ivan on 31/05/2020
 */

/**
 * Extended String with custom written function
 * */
fun String.hello(){
     println("It's me")
}

fun String.toTitleCase(): String{
    return this.split(" ").joinToString(" ") { it.capitalize() }
}

fun main(args: Array<String>) {
    "Hello".hello()

    println("This is sample String to Title Case it".toTitleCase())


    val customer = Customer()
    customer.makePreffered()

    val instance: BaseClass = InheritedClass()

    instance.extension()
}


/**
 * If the member function and extension function have same names, member function has priority
 */

class Customer {
    fun makePreffered(){
        println("Customer version")
    }
}

fun Customer.makePrefered(){
    println("Extended version")

}


/**
 * Extension functions are statically resolved
 *
 * */
open class BaseClass
class InheritedClass: BaseClass()

fun BaseClass.extension(){
    println("Base extension")
}

fun InheritedClass.extension() {
    println("Inherited extension")
}