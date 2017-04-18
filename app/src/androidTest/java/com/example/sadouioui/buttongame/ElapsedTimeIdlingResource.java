package com.example.sadouioui.buttongame;

import android.support.test.espresso.IdlingResource;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)


public class ElapsedTimeIdlingResource implements IdlingResource {
    private long startTime;
    private final long waitingTime;
    private ResourceCallback resourceCallback;

    public ElapsedTimeIdlingResource(long waitingTime) {
        this.startTime = System.currentTimeMillis();
        this.waitingTime = waitingTime;
    }

    @Override
    public String getName() {
        return ElapsedTimeIdlingResource.class.getName() + ":" + waitingTime;
    }

    @Override
    public boolean isIdleNow() {
        long elapsed = System.currentTimeMillis() - startTime;
        boolean idle = (elapsed >= waitingTime);
        if (idle) {
            resourceCallback.onTransitionToIdle();
        }
        return idle;
    }

    @Override
    public void registerIdleTransitionCallback(ResourceCallback resourceCallback) {
        this.resourceCallback = resourceCallback;
    }
}
