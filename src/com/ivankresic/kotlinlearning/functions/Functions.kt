package com.ivankresic.kotlinlearning.functions

/**
 * Created by ivan on 28/05/2020
 */



/**
 * The type with only one value: the Unit object. This type corresponds to the `void` type in Java.
 *
 * Unit is a default return type, simmilar like void, but not void :)
 * It's an object so comparison is possible
 * i.e: if (function returns Unit) do something
 */

fun hello() : Unit{
    println("Hello")
}


/**
 * Nothing has no instances. You can use Nothing to represent "a value that never exists": for example,
 * if a function has the return type of Nothing, it means that it never returns (always throws an exception).
 */
fun throwingExceptions(): Nothing{
    throw Exception("This function throws an exception!")
}

fun returnsFour(): Int{
    return 4
}

//Single parameter
fun takingString(name: String){
    println(name)
}

//With defined return type
fun sum(x: Int, y: Int): Int{
    return x+y
}

//Single expression function
fun sumAsSingleExpressionFunction(x: Int, y: Int) = x + y

/**
 * Single expression function with default value for z. So that parameter can be passed on call, but not necessary
 * This helps in reducing amount of overload methods
 */

fun sumWithDefault(x: Int, y: Int, z: Int = 0) = x + y + z


fun printDetails(name: String, email: String = "", phone: String){
    println("Name: $name - Email: $email - Phone: $phone")
}

/**
 * vararg -> variable  amount of arguments
 * this allows us to pass multiple arguments
 */
fun printStrings(vararg strings: String){
    reallyPrintingStrings(*strings)// star '*' is spread operator
}

//extracted from printStrings
private fun reallyPrintingStrings(vararg strings: String) {
    for (a in strings)
        println(a)
}


fun main(args: Array<String>) {
    hello()
    val four = returnsFour()

    takingString("Passing name")
    sumAsSingleExpressionFunction(1,2)

    //in this case z = 0
    sumWithDefault(1,2)

    //in this case z = 3
    sumWithDefault(1,2,3)

    //this would not be possible even tough middle parameter has default value:
    //printDetails("Ivan", "555")

    //this is one solution
    printDetails("Ivan", phone = "555 123 ")

    //passing multiple arguments
    printStrings("1")
    printStrings("1", "2")
    printStrings("1", "2", "3")
    printStrings("1", "2", "3", "4")

}

