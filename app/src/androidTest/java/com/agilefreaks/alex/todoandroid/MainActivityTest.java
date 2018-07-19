package com.agilefreaks.alex.todoandroid;

import android.content.ComponentName;
import android.support.test.espresso.intent.Intents;
import android.support.test.rule.ActivityTestRule;

import android.content.Intent;
import android.support.test.espresso.intent.Intents;
import android.support.test.rule.ActivityTestRule;
import android.view.View;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.contrib.RecyclerViewActions.scrollTo;
import static android.support.test.espresso.matcher.ViewMatchers.hasDescendant;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static org.hamcrest.Matchers.allOf;
import static org.junit.Assert.fail;

public class MainActivityTest
{

    @Rule
    public ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() throws Exception
    {
        //Intents.init();
    }

    @Test
    public void addToDo_Button()
    {
        //click the button
        onView(withId(R.id.addToDo_button)).perform(click());
    }

    @Test
    public void addToDo_LunchAddToDo()
    {
        Intents.init();

        //click the button
        onView(withId(R.id.addToDo_button)).perform(click());

        intended(hasComponent(AddToDoActivity.class.getName()));
    }
}