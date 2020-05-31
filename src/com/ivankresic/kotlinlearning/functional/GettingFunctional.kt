package com.ivankresic.kotlinlearning.functional

/**
 * Created by ivan on 31/05/2020
 */


/**
 * Here we have function that takes a function as parameter. Function takes 2 paramaters of type Int, and return Int
 * op:(Int, Int) -> Int
 *
 * fun 'operation' is higher order function that takes in another function as parameter
 * */
fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}


//Another sample
fun operation(x: Int, op: (Int) -> Unit){

}

fun route(path: String, vararg : (String, String) -> String){

}

fun unaryOperation(x: Int, op:(Int) ->Int){

}

fun unaryOp(op: (Int) -> Int){
    println(op)
}

fun sum(x: Int, y: Int) = x + y

fun transaction(db: Database, code: () -> Unit){
    try {
        code()
    }finally {
        db.commit()
    }
}

class Database{
     fun commit() {}
}

fun main(args: Array<String>) {

    /**
     * In this way we reference function in kotlin, with two collons :: and than writing a fun name
     * */
    println(operation(2, 2, ::sum))


    /**
     * Here we have lambda expression, and using it we don't have to declare function that we want to pass to another function
     * We can write function body in curly brackets, and because fun "operations" knows what types it expects, we don't
     * have to declare types in lambda expression.
     * */
    operation(2,2, {x, y -> x + y})


    /**
     * But if we extract lambda to variable, then we have to declare types, because then we can not know where it is going to be used
     * */
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    operation(2,2, sumLambda)



    unaryOperation(2, {x -> x * x})


    /**
     * In Kotlin, if lambda has single parameter, we don't have to be explicit, we can use word "it". So we don't need declaration
     * of parameter
     * */
    unaryOperation(2, {it * it})


    /**
     * Same expression can be written a bit differently:
     * first parameter as is, and expression outside of brackets, because higher order function is last parameter
     * */
    unaryOperation(2) {it * it}

    /**
     * If the function expects only higher order function, and no other parameters,
     * then we can write to function body directly as follows:
     * */
    unaryOp { it * it }


    /**
     * This is example of annonymous function - it has no name
     * Difference between this and lambda is that here you can define return type, and have multiple return points
     * */
    unaryOperation(2, fun(x: Int) : Int {return x * x})



    val db = Database()
    transaction(db){
        //interact with database
        //some code
    }
}