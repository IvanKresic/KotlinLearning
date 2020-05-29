package com.ivankresic.kotlinlearning.nulls

/**
 * Created by ivan on 29/05/2020
 */

class Service{
    fun evaluate(){}
}
class ServiceProvider{

}


fun main(args: Array<String>) {

    val message: String = "A message"

    //in Kotlin assigning null to variable is not supported
    //val message: String = null --> not supported

    //but it is possible to declare nullable variable

    /**
     * If we add '?' to the variable type --> that variable can hold null
     * */
    val nullMessage: String? = null
    val inferredNull = null //--> also one of possible ways


    //- adding a '?' here we asign null check and in that way we can avoid multiple nullcheck if's
    // so only if value is not null, the invoke methond length on it, if it is null, don't do it
    println(nullMessage?.length)



    //with double '!!' sign we tell the compiler that we take care of if its null or not
    //actually just saying stop complaining, its ok
    //so accessing members without null check
    println(nullMessage!!.length)


    val sp = ServiceProvider()


}