package com.example.testing_unit_espresso

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.rule.ActivityTestRule
import org.junit.After
import org.junit.Test
import androidx.test.espresso.assertion.ViewAssertions.matches

import org.junit.Assert.*
import org.junit.Rule

class MainActivityTest {

    @Rule @JvmField var activityTestRule = ActivityTestRule(MainActivity::class.java)

    val name: String = "Tony"
     @After
    fun tearDown() {
    }

    @Test
    fun testUser(){
        Espresso.onView(withId(R.id.editTextName)).perform(typeText(name))
        Espresso.closeSoftKeyboard()
        Espresso.onView(withId(R.id.button)).perform(click())
        Espresso.onView(withId(R.id.textViewResult)).check(matches(withText(name)))
    }

    @Test
    fun onCreate() {
    }
}