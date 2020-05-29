package com.ivankresic.kotlinlearning.inheritance

/**
 * Created by ivan on 29/05/2020
 */

//Abstract classes are similar to interfaces but allow states

abstract class StoredEntity{
    val isActive= true
    abstract fun store()
    fun status(): String{
         return isActive.toString()
    }
}

class Employee : StoredEntity() {
    override fun store() {

    }
}

fun main(args: Array<String>) {
    var employee = Employee()
    employee.isActive
    employee.status()
}