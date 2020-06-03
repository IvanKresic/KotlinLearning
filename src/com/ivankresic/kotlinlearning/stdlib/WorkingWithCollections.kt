package com.ivankresic.kotlinlearning.stdlib

/**
 * Created by ivan on 01/06/2020
 */

fun main(args: Array<String>) {

    /**
     * Kotlin doesn't have it's own collections, but instead provides interfaces on top of
     * Java collections (mutable and immutable interfaces)
     * */

    /**
     * A generic ordered collection of elements. Methods in this interface support only read-only access to the list;
     * read/write access is supported through the [MutableList] interface.
     * @param E the type of elements contained in the list. The list is covariant on its element type.
     */
    var list: List<String> = ArrayList()


    /**
     * Returns a new read-only list of given elements.  The returned list is serializable (JVM).
     * @sample samples.collections.Collections.Lists.readOnlyList
     */
    var listKotlin = listOf("First", "Second", "Third")


    var emptyList = emptyList<String>()


    val numbers = 1..100

    val mutableCities = mutableListOf("Madrid")
    mutableCities.add("London")

    val hashMap = hashMapOf(Pair("Madrid", "Spain"), Pair("Pariz", "France"))


    val booleans = booleanArrayOf(true, false, true)

    val characters = charArrayOf('A', 'B')

    //similar for other types
}