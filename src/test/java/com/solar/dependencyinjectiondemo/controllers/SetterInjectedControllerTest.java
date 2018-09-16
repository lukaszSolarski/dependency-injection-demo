package com.solar.dependencyinjectiondemo.controllers;

import com.solar.dependencyinjectiondemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        /*
        We use setter and that's way this way of DI is called "setter injected"
        If next statement will be commented, there will be no dependency injection and
        NPE (NullPointerException) will occur
         */
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl()) ;
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO, setterInjectedController.sayHello());
    }
}
