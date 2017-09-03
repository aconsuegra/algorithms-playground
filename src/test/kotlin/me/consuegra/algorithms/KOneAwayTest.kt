package me.consuegra.algorithms

import org.junit.Assert.*
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as iz

class KOneAwayTest {
    
    val oneAway = KOneAway()

    @Test
    fun testOneAway() {
        assertThat(oneAway.oneAway("abc", "a"), iz(false))
        assertThat(oneAway.oneAway("a", "b"), iz(true))
        assertThat(oneAway.oneAway("ab", "cd"), iz(false))
        assertThat(oneAway.oneAway("abc", "ac"), iz(true))
        assertThat(oneAway.oneAway("abc", "bc"), iz(true))
        assertThat(oneAway.oneAway("abcd", "abcdef"), iz(false))
        assertThat(oneAway.oneAway("abcdef", "abcdff"), iz(true))
    }
    
}