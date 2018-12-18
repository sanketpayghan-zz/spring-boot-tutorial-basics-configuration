package com.in28minutes.springboot.tutorial.basics.pojo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

public class GreetingsTest {

    @Mock
    private Greetings greetings;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getMessage() {
        when(greetings.getMessage()).thenReturn("Hello Sanket");
        Assert.assertEquals("Hello Sanket", greetings.getMessage());
    }

    @Test
    public void getLuckyNumber() {
        when(greetings.getLuckyNumber()).thenReturn(7l);
        Assert.assertEquals(7l, greetings.getLuckyNumber());
    }

    @Test
    public void getMessageAndGetLuckNumber() {
        when(greetings.getMessage()).thenReturn("Hello");
        when(greetings.getLuckyNumber()).thenReturn(7l);
        Assert.assertEquals(greetings.getMessage(), "Hello");
        Assert.assertEquals(greetings.getLuckyNumber(), 7l);
    }
}