package com.example.sadouioui.buttongame;


import android.os.SystemClock;
import android.provider.Settings;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.IdlingResource;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
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

public class player1test {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void player1test() {
        ViewInteraction textView0 = onView(
                allOf(withId(R.id.textView), withText("0"),
                        isDisplayed()));
        textView0.check(matches(withText("0")));

        ViewInteraction appCompatButton = onView(allOf(withId(R.id.button), withText("Player 1"), isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction textView = onView(
                allOf(withId(R.id.textView), withText("1"),
                        isDisplayed()));
        textView.check(matches(withText("1")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.textView1), withText("1"),
                        isDisplayed()));
        textView2.check(matches(withText("1")));

    }
}
