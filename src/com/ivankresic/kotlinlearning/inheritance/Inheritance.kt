package com.ivankresic.kotlinlearning.inheritance

/**
 * Created by ivan on 29/05/2020
 */

/**
 * The root of the Kotlin class hierarchy. Every Kotlin class has [Any] as a superclass.
 */


open class Person{
    open fun validate(){

    }
}

//Person is by default a closed(final) class. So open annotation is used to "open" class
open class Customer: Person{


    //in order to enable overriding member functions, they also need to be declared as open
    final override fun validate() {

    }

    // if we want to inherit constructor of base class we use super
    constructor(): super() {

    }

}

class SpecialCustomer: Customer(){
    //because validate is override as final in Customer, we cannot override it here
    //it's also impossible to declare new validate fun here
}

data class CustomerEntity(var name: String) : Person()

fun main(args: Array<String>) {
    val customer = Customer()
    customer.validate()
}