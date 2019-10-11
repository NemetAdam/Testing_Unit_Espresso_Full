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

import org.junit.Rule

class MainActivityTest {

    @Rule @JvmField var activityTestRule = ActivityTestRule(MainActivity::class.java)

    private val name: String = "Tony"
    private val age: String = "20"
     @After
    fun tearDown() {
    }

    @Test
    fun testUserNameInput(){
        Espresso.onView(withId(R.id.editTextName)).perform(typeText(name))
    }
    @Test
    fun testUserNameInputClick(){
        Espresso.onView(withId(R.id.editTextName)).perform(typeText(name))
        Espresso.closeSoftKeyboard()
        Espresso.onView(withId(R.id.button)).perform(click())
        Espresso.onView(withId(R.id.textViewResult)).check(matches(withText(name)))
    }

    @Test
    fun testUserAgeInput(){
        Espresso.onView(withId(R.id.editTextAge)).perform(typeText(age))
    }
    @Test
    fun testUserAgeInputClick(){
        Espresso.onView(withId(R.id.editTextAge)).perform(typeText(age))
        Espresso.closeSoftKeyboard()
        Espresso.onView(withId(R.id.buttonAge)).perform(click())
        Espresso.onView(withId(R.id.textViewAge)).check(matches(withText(age)))
    }

    @Test
    fun testUserAgeAndNameInput(){
        Espresso.onView(withId(R.id.editTextAge)).perform(typeText(age))
    }
    @Test
    fun testUserAgeAndNameInputClick(){
        Espresso.onView(withId(R.id.editTextName)).perform(typeText(name))
        Espresso.closeSoftKeyboard()
        Espresso.onView(withId(R.id.editTextAge)).perform(typeText(age))
        Espresso.closeSoftKeyboard()
        Espresso.onView(withId(R.id.buttonShowBoth)).perform(click())
        Espresso.onView(withId(R.id.textViewAge)).check(matches(withText(age)))
        Espresso.onView(withId(R.id.textViewResult)).check(matches(withText(name)))
    }



}