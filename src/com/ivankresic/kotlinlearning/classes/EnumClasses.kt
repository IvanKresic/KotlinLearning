package com.ivankresic.kotlinlearning.classes

/**
 * Created by ivan on 29/05/2020
 */

enum class Priority{
    MINOR,
    NORMAL,
    MAJOR,
    CRITICAL
}

enum class Priority2(val value: Int){
    MINOR(-1),
    NORMAL(0),
    MAJOR(1),
    CRITICAL(10)
}


enum class Priority3(val value: Int){
    MINOR(-1) {
        override fun text(): String {
            return "[MINOR PRIORITY]"
        }
    },
    NORMAL(0) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    MAJOR(1) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    CRITICAL(10) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }; //-> one of the few places when kotlin requires semicolon


    abstract fun text(): String //now each enum neeeds to implement this
}





fun main(args: Array<String>) {
    val priority = Priority.NORMAL
    val priority2 = Priority2.NORMAL

    println("Priority : $priority") // its taking the value of a string and printing it out, in this case it will print out: NORMAL

    println("Priority2 : $priority2")
    println("Priority2 - value: ${priority2.value}")
    println("Priority ordinal ${Priority.CRITICAL.ordinal}") //will print 3


    for(prioInList in Priority.values()){
        println(prioInList)
    }

    val p = Priority.valueOf("MAJOR")
    println(p)
    println(p.ordinal)



    println(Priority3.MINOR.text())
}