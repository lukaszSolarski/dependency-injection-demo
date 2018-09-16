package com.solar.dependencyinjectiondemo.controllers;

import com.solar.dependencyinjectiondemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        /*
        This is the best way to DI because theres no way to create the controller without providing dependency
         */
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO, constructorInjectedController.sayHello());
    }
}
