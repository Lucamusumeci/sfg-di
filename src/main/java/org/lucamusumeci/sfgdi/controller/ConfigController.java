package org.lucamusumeci.sfgdi.controller;

import org.lucamusumeci.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConfigController {

    private final GreetingService greetingService;

    public ConfigController(@Qualifier("methodThatDefinesTheBeanForAService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayHello();
    }
}
