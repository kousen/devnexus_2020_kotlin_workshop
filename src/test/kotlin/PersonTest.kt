import org.junit.Assert.*
import org.junit.Test

class PersonTest {
    @Test
    fun `check object equivalence`() {
        val fred1 = Person("Fred", "Flinstone")
        val fred2 = Person("Fred", "Flinstone")
        assertTrue(fred1 == fred2)
    }

    @Test
    fun `check reference equality`() {
        val fred1 = Person("Fred", "Flinstone")
        val fred2 = Person("Fred", "Flinstone")
        assertFalse(fred1 === fred2)
    }
}