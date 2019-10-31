package uk.sawcz.sampleapplication

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class SimpleClassConnectedTest {

    @Test
    fun connectedTest() {
        assertFalse(SimpleClass().connectedTested(true))
        assertTrue(SimpleClass().connectedTested(false))
    }
}