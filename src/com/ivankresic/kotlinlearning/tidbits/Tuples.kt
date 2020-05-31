package com.ivankresic.kotlinlearning.tidbits

import com.ivankresic.kotlinlearning.classes.CustomerKotlin

/**
 * Created by ivan on 30/05/2020
 */

fun capitalAndPopulation(country: String): Pair<String, Long>{
    return Pair("Madrid", 23000000)
}

fun countryInformation(country: String): Triple<String, String, Long>{
    return Triple("Madrid", "Europe", 2300000)
}

fun main(args: Array<String>) {

    val result = capitalAndPopulation("Madrid")


    //accessing values of a pair using first and second
    println(result.first)
    println(result.second)


    val countryInfo = countryInformation("Spain")
    println(countryInfo.first)
    println(countryInfo.second)
    println(countryInfo.third)


    //DECONSTRUCTING PAIR VALUES
    val (capital, population) = capitalAndPopulation("Madrid")
    println(capital)
    println(population)


    //DECONSTRUCTING TRIPLES VALUES
    val (cap, continent, pop) = countryInformation("Madrid")
    println(cap)
    println(continent)
    println(pop)


    //So it can be used as follows
    val (id, name, email) = CustomerKotlin(1, "Ivan", "Email", "123")
    println(name)


    val listOfCapitalsAndCountries = listOf(Pair("Madrind", "Spain"), "Paris" to "France")

    for ((capital2, country) in listOfCapitalsAndCountries){
        println("$capital2 - $country")
    }

}