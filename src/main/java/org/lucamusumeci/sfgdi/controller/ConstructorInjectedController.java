package org.lucamusumeci.sfgdi.controller;

import org.lucamusumeci.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    //@Autowired    //Not needed since Spring 4
    public ConstructorInjectedController(@Qualifier("greetingServiceRudeImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayHello();
    }
}