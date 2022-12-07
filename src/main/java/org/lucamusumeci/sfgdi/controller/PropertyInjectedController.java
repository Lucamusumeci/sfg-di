package org.lucamusumeci.sfgdi.controller;

import org.lucamusumeci.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("greetingServiceImpl")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayHello();
    }
}
