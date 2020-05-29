package com.ivankresic.kotlinlearning.inheritance

class GenericRepository<T> : Repository<T> {
    override fun getById(id: Int): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): List<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}


/******************************************************************************************************
 * different way of implementing the same thing as GenericRepository  --> not that usefull
 ***************************************************************************************************** */

//Doesnt make sense to use this when all of the function members are of the same type
//Only usefull if they are different types (i.e. getAll is of type R instead of T) --> getAllR
interface Repo {

    //writing <T> between fun and function name declares that function is generic
    fun <T> getById(id: Int): T
    fun <T> getAll():List<T>
    fun <R> getAllR():List<R>
}


//In this implementation T paramenter moved from class to the actual functions
class MyRepo: Repo {
    override fun <R> getAllR(): List<R> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T> getById(id: Int): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T> getAll(): List<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}