package com.solar.dependencyinjectiondemo.controllers;

import com.solar.dependencyinjectiondemo.services.GreetingServiceImpl;
/*
Example of manual DI.
Using this DI (property injected) is wrong!
 */
public class PropertyInjectedController {
    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }
}
