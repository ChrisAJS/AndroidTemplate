package uk.sawcz.sampleapplication

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.junit.Test

class SimpleFragmentTest {
    @Test
    fun canHandleClicks() {
        launchFragmentInContainer<SimpleFragment>()

        onView(withId(R.id.simpleButton)).perform(click())

        onView(withId(R.id.simpleTitle)).check(matches(withText(R.string.clicked)))
    }
}