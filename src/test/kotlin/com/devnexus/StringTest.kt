package com.devnexus

import isPalindrome
import org.junit.Assert.assertEquals
import org.junit.Test

class StringTest {
    @Test
    fun `array of strings`() {
        val strings = arrayOf("this", "is", "an", "array", "of", "strings")
        assertEquals(6, strings.size)
    }

    @Test
    fun `use index for get and set`() {
        val strings = arrayOf("this", "is", "an", "array", "of", "strings")
        assertEquals("this", strings[0])
        assertEquals("this", strings.get(0))

        strings[0] = "This"
        assertEquals("This", strings.get(0))
    }

    @Test
    fun `list of strings`() {
        val strings = listOf("this", "is", "a", "list", "of", "strings")
        assertEquals("this", strings[0])
        // strings[0] = "This" // listOf produces "immutable" list
    }

    @Test
    fun `modifiable list of strings`() {
        val strings = mutableListOf("this", "is", "a", "list", "of", "strings")
        strings.addAll(listOf("with", "more", "elements"))
        assertEquals(9, strings.size)
    }

    @Test
    fun `map of strings to lengths`() {
        val strings = "this is a map of strings".split("""\s+""".toRegex())
        val mapOfStringsToLengths = mutableMapOf<String, Int>()
        for (s in strings) {
            mapOfStringsToLengths[s] = s.length
        }
        println(mapOfStringsToLengths)

        for ((k,v) in mapOfStringsToLengths) {
            println("$k has length $v")
        }
    }

    @Test
    fun `nothing data type`() {
        var x = null
    }

    @Test
    fun `palindrome tests`() {
        isPalindrome("Madam, in Eden, I'm Adam")
        isPalindrome("Flee to me, remote elf!")
        isPalindrome("racecar")
    }

    @Test
    fun `let demo from docs`() {
        val numbers = mutableListOf("one", "two", "three", "four", "five")
        numbers.map { it.length }.filter { it > 3 }.also(::println)
    }

    @Test
    fun `create a map of Pairs`() {
        val map = mapOf("a" to 1, "b" to 2, "c" to 2, Pair("d", 3))
        println(map)
    }
}