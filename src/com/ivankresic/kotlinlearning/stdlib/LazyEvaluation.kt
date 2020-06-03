package com.ivankresic.kotlinlearning.stdlib

/**
 * Created by ivan on 03/06/2020
 */

fun main(args: Array<String>) {

    val elements = 1..10000000000000

    val output = elements.filter { it < 30 }.map { Pair("Yes", it) }


    /**
     * Creates a [Sequence] instance that wraps the original collection returning its elements when being iterated.
     *
     * @sample samples.collections.Sequences.Building.sequenceFromCollection
     */
    // asSequence converts collection into lazy collection
    val output1 = elements.asSequence().filter { it < 30 }.map { Pair("Yes", it) }

    /*
    * Because of the big number, it will take him a longer time to print it, because it wil all the results print once it is finished
    * */
    output.forEach {
        println(it)
    }


    /*
    * Because of using asSequence(), it will not wait finish to print the results, actually it will print the results it
    * already has, and continue filtering
    * */
    output1.forEach {
        println(it)
    }


    //printing the sum of first 30 elements, and then it will stop -> take(30) will stop it
    val output2 = elements.asSequence().take(30).sum()
    println(output2)


    /**
     * Returns a sequence defined by the starting value [seed] and the function [nextFunction],
     * which is invoked to calculate the next value based on the previous one on each iteration.
     *
     * The sequence produces values until it encounters first `null` value.
     * If [seed] is `null`, an empty sequence is produced.
     *
     * The sequence can be iterated multiple times, each time starting with [seed].
     *
     * @see kotlin.coroutines.experimental.buildSequence
     *
     * @sample samples.collections.Sequences.Building.generateSequenceWithSeed
     */
    val numbers = generateSequence(1) { x -> x * 10 }
    println(numbers.take(30).sum())


    /*
        This allows us lazy initialization. That means this chunk of code will not be initialized immediately
        when runned from top-down, but rather will initialize it when lazy code is called
    */
    val lazyInt: Int by lazy { 10 }

}