package com.example.sadouioui.buttongame;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class pl1test {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void pl2test() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.button2), withText("Player 2"), isDisplayed()));
        appCompatButton.perform(click());

        onView(withId(R.id.textView)).check(matches(withText("-1")));
    }

    @Test
    public void pl1test() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.button1), withText("Player 1"), isDisplayed()));
        appCompatButton.perform(click());

        onView(withId(R.id.textView)).check(matches(withText("1")));

    }

}
