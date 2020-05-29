package com.ivankresic.kotlinlearning.inheritance

/**
 * Created by ivan on 29/05/2020
 */
interface CustomerRepository {

    val isEmpty: Boolean // = true - will raise error - cannot maintain state

    //fun staff, there is a body of member function with implementation
    //interface can have default implementation
    //Big difference is that you cannot maintain state
    fun store(obj: Customer){
        //implement code to store
    }
    fun getById(id:Int): Customer

}

interface EmployeeRepository{
    fun store(obj: Employee){

    }
    fun getById(id: Int): Employee
}

class SQLCustomerRepository: CustomerRepository {
    override val isEmpty: Boolean
        get() = false

    override fun getById(id: Int): Customer {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    //it is possible to override member functions that actually have default implementation in Interface
    override fun store(obj: Customer) {
        super.store(obj)
    }

}


interface Interface1{
    fun funA() {
        println("Fun A from Interface 1 ")
    }
}

interface Interface2{
    fun funA() {
        println("Fun A from Interface 2 ")
    }
}

/**
 * both interfaces have a same function name, so if we implement both of them we will override fun only once
 * */
class Class1And2: Interface1, Interface2{
    override fun funA() {
        //if we call this fun it will print "Our own"
        //println("Our own")

        //but, the problem is if we call super
        //He will get confused with interface is super 1, or 2
        //In order to resolve that problem we can explicitly write like follows:
        super<Interface2>.funA()
    }
}

fun main(args: Array<String>) {
    val ourClass = Class1And2()
    ourClass.funA()
}