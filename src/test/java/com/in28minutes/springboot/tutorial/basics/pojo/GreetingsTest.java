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
}