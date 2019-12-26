package org.lucamusumeci.sfgdi.controller;

import org.lucamusumeci.sfgdi.service.GreetingService;

public class NonSpringPropertyInjectedController {

    public GreetingService greetingService;
    public String sayHello(){
        return greetingService.sayHello();
    }
}
