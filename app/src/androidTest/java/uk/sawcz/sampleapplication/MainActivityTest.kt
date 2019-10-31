package uk.sawcz.sampleapplication

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test


class MainActivityTest {

    @get:Rule
    val rule = ActivityTestRule(MainActivity::class.java, true, true)

    @Test
    fun willDisplaySimpleFragment() {
        onView(withId(R.id.simpleTitle)).check(matches(isDisplayed()))
    }
}
