package com.solar.dependencyinjectiondemo.controllers;

import com.solar.dependencyinjectiondemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {
    private  PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        /*
        We directly use property to set object and that's way this way of DI is called "property injected"
        If next statement will be commented, there will be no dependency injection and
        NPE (NullPointerException) will occur
         */
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO, propertyInjectedController.sayHello());
    }
}
