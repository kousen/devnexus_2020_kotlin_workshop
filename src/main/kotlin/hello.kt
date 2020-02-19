import java.lang.Exception

fun isPalindrome(s: String) : Boolean {
    val testString = s.toLowerCase().replace("""\W""".toRegex(), "")
        .replace("""_""","")
    println(testString)
    return testString == testString.reversed()
}

fun doubleAllValues(list : List<Int>) =
    list.map { it * 2 }

fun sumDoublesDiv3(list: List<Int>) =   // [3, 1, 4, 1, 5, 9]
    list.map { it * 2 }                 // [6, 2, 8, 2, 10, 18]
        .filter { it % 3 == 0 }         // [6, 18]
        .first()                        // 6

fun sequenceDoublesDiv3(list: List<Int>) =
    list.asSequence().map { it * 2 }
        .filter { it % 3 == 0 }
        .first()

@JvmOverloads
fun sayHello(name: String = "World") = "Hello, $name!"

fun getNameLength(name: String?) =
    "The name has ${name?.length ?: 0} characters"

data class Person(
    val first: String,
    val last: String
) : Any(), Comparable<Person> {
    override fun toString(): String {
        return "$first $last"
    }

    override fun compareTo(other: Person): Int {
        return if (last.compareTo(other.last) != 0) {
            last.compareTo(other.last)
        } else {
            first.compareTo(other.first)
        }
    }
}

operator fun String.times(n: Int) = this.repeat(n)

fun main() {
    val s = "abc"
    println(s * 3)

    for (n in 1..10) {
        val result =
            when (n % 3) {
                0 -> "$n is divisible by 3"
                // is Int? -> "$n could be null"
                in 4..7 -> null
                1 ->  {
                    "$n % 3 == 1"
                }
                2 -> "$n % 3 == 2"
                else -> throw Exception("oops")
            }
        println(result)
    }
}