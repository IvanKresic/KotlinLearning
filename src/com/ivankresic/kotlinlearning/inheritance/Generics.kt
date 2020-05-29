package com.ivankresic.kotlinlearning.inheritance

/**
 * Created by ivan on 29/05/2020
 */

/**
 * Generic type takes parameter T
 * */

interface Repository<T> {

    fun getById(id: Int): T
    fun getAll(): List<T >
}

fun main(args: Array<String>) {

    //generic repository of type customer
    val customerRepo = GenericRepository<Customer>()
    val customer = customerRepo.getById(10)
    val customers = customerRepo.getAll()

}