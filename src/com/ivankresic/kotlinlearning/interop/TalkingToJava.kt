package com.ivankresic.kotlinlearning.interop

import com.ivankresic.kotlinlearning.classes.CustomerJava

/**
 * Created by ivan on 31/05/2020
 */

fun main(args: Array<String>) {
    val customer = CustomerJava()

    customer.email = "email@email.com"

    customer.prettyPrint()


    /**
     * Passing a codeblock without neeed to implement the whole interface
     * */
    val runnable = Runnable { println("Invoking runnable") }


    val kr = CustomerKotlinRepo()
    val customerJava = kr.getById(10)

    customerJava?.id



    /**
     * Because using annotation @NeverNull autocompletion shows no "!" mark for neverNull member
     * Also, because not using same annotation for sometimesNull we have "!" on autompletion telling us
     * that return from that member can be null
     * */
    customer.neverNull()
    customer.sometimesNull()
}

class PersonKotlin : PersonJava() {

}

class RunnableKotlin: Runnable {
    override fun run() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}


/**
 * Because calling Java, and returns from Java can be null, so null-safety '?' is added to return type
 * Removing signs wont raise worning
 * */
class CustomerKotlinRepo: CustomerRepository{
    override fun getById(id: Int): CustomerJava? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): MutableList<CustomerJava>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}