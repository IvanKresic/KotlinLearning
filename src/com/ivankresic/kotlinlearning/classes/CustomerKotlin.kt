package com.ivankresic.kotlinlearning.classes

import java.io.IOException

/**
 * Created by ivan on 29/05/2020
 */

data class CustomerKotlin(val id:Int, var name: String, var email: String, val phone: String?){

    @JvmField val someField = "Value"

    //it is possible to override toString, equalsTo and hashCode of data classes
    override fun toString(): String {
        return "{\"Id:\" : \"$id\", \"Name\": \"$name\", \"Email\": \"$email\"}"
    }
    /**
     * Trick when writing strings like this, you can edit it as JSON, and IDE will escape all special characters for you
     * -> empty string -> alt+enter -> inject language or reference -> Json -> alt+enter -> Json fragment
     * */


    @JvmOverloads fun changeStatur(status: Status = Status.CURRENT){

    }

    @JvmName("preferential") fun makePrefered(){

    }


    @Throws(IOException::class) fun loadStatistics(filename: String){
        if(filename ==""){
            throw IOException("Filename cannot be blank")
        }
    }
}

fun CustomerKotlin.extension(){

}

enum class Status{
    CURRENT,
    PAST
}

fun main(args: Array<String>) {



    val  customer1 = CustomerKotlin(1, "ivan", "ivan@email.com","123")
    val  customer2 = CustomerKotlin(1, "ivan", "ivan@email.com", "123")


    //this print will display pointer object to the customer instance because there is no toString() built in ordinary class
    //but defining our class as data class we get this features
    println(customer1)

    //also data class has also built in equals to and hashCode
    if(customer1 == customer2){
        println("They are the same objects")
    }

    val customer3 = customer1
    val customer4 = customer1.copy()
    println(customer4)

    val customer5 = customer1.copy(2, "Jozef")
    println(customer5)
}