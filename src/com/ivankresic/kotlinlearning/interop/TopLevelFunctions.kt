
/**
 * Using this annotation we can name static class created for us where
 * Otherwise created class would be created as it is named
 * */
@file:JvmName("UtilityFunctions")

package com.ivankresic.kotlinlearning.interop

/**
 * Created by ivan on 31/05/2020
 */


/**
 * So here we have functions that are not wrapped in class
 * When we compile this
 * */
fun prefix(prefix: String, value: String): String {
     return "$prefix-$value"
}

const val CopyrightYear = 2014