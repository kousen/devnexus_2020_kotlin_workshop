package com.devnexus.icndb

import org.junit.Assert.*
import org.junit.Test

class JokeServiceTest {
    @Test
    fun `get joke with default name`() {
        println(getJoke())
    }

    @Test
    fun `get joke with a different name`() {
        println(getJoke(first = "Jean-Luc", last = "Picard"))
    }
}