package com.ivankresic.kotlinlearning.stdlib

import com.ivankresic.kotlinlearning.functional.toTitleCase

/**
 * Created by ivan on 03/06/2020
 */

data class Album(val title: String, val year: Int, val chartUK: Int, val chartUS: Int, val tracks: List<Track> = listOf())

data class Track(val title: String, val durationInSeconds: Int)

val albums = listOf(
                Album("The Dark Side of the Mood", 1973, 2, 1,
                        listOf(
                                Track("Speak to me", 90),
                                Track("Breathe", 163),
                                Track("On the run", 216),
                                Track("Time", 421),
                                Track("The Great Gig in the Sky", 276),
                                Track("Money",382),
                                Track("Us and Them", 462),
                                Track("Any Color You Like", 205),
                                Track("Brain Damage", 228),
                                Track("Eclipse", 123)
                        )
                ),
                Album("The Wall", 1979, 3,1),
                Album("Wish you were here", 1975, 1, 1),
                Album("The Piper at the Gates of Dawn", 1967, 6,131),
                Album("The Final Cut", 1983, 1,6),
                Album("Meddle", 1971, 3,70),
                Album("Atom Heart Mother", 1970, 1,55),
                Album("Ummagumma", 1969, 5,74),
                Album("A Sauceful of Secrets", 1968, 9,0),
                Album("More", 1969, 9,153)
            )


fun albumAndTrackLowerThanXSeconds(duration: Int, albums: List<Album>): List<Pair<String, String>>{

    /**
     * Returns a single list of all elements yielded from results of [transform] function
     * being invoked on each element of original collection.
     */
    //[a, b, c] f(x) => [f(a), f(b), f(c)] --> this is what map does
    //[[a,b], [c, d]] f(x) => [f(a), f(b), f(c), f(d)] -> this is what flatMap does -- flattening a collection of collections
    return albums.flatMap {
        val album = it.title
        it.tracks.filter {
            it.durationInSeconds <= duration
        }.map {
            Pair(album, it.title)
        }

    }
}

fun main(args: Array<String>) {
    /*
    * Finding all albums that were number one in UK charts
    * */

    //Non functional approach
    for (album in albums)
        if(album.chartUK == 1) println("Found - ${album.title}")


    //Functional approach
    /**
     * Performs the given [action] on each element.
     */

    //Taking in lambda expression
    albums.forEach {
        albums -> if(albums.chartUK == 1) println("Found - ${albums.title}")
    }
    //If lambda takes single parameter we can simplify -> it
    albums.forEach {
        if(it.chartUK == 1) println("Found - ${it.title}")
    }


    /**
     * Returns a list containing only elements matching the given [predicate].
     */
    val albums1 = albums
    albums1.filter { it.chartUK == 1 }
    albums1.forEach { println("Found: ${it.title}") }

    //This two expressions can be concatenated inline using method/function pipelineing
    albums.filter { it.chartUK == 1 }
            .forEach {
                val titles = mutableListOf<String>()
                titles.add(it.title)
                println("Found: ${it.title}")
    } //There is better way of doing this forEach code chunk using map


    /*
    * What map does is allow us to map a collection with certain values into another collection with some other values
    * applying mapping function
    * */
    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each element in the original collection.
     */
    val titles = albums.filter { it.chartUK == 1 }
            .map {  it.title }

    //it is also possible to use more values, not just single value
    val titles1 = albums.filter { it.chartUK == 1 }
            .map {  Pair(it.title, it.year) }

    titles.forEach { println(it) }


    albumAndTrackLowerThanXSeconds(200, albums).forEach {
        println(it.first)
    }


}