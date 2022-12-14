package org.lucamusumeci.sfgdi.controller;

import org.lucamusumeci.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller("xmlController")
public class XMLController {

    private final GreetingService greetingService;


    public XMLController(@Qualifier("serviceDefinedViaXML") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayHello();
    }
}
