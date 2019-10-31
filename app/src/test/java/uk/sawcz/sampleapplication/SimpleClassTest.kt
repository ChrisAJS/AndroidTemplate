package uk.sawcz.sampleapplication

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class SimpleClassTest {
    @Test
    fun jvmTest() {
        assertFalse(SimpleClass().jvmTested(true))
        assertTrue(SimpleClass().jvmTested(false))
    }
}
