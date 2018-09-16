package com.solar.dependencyinjectiondemo.controllers;

import com.solar.dependencyinjectiondemo.services.GreetingService;

/*
It's better than property injected because it uses interface instead of concrete class
 */
public class SetterInjectedController {
    private GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

}
