package org.lucamusumeci.sfgdi.controller;

import org.lucamusumeci.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller("InternationalizationController")
public class I18nController {
    private final GreetingService greetingService;

    //@Autowired is not required. This controller uses Constructor DI
    public I18nController(@Qualifier("I18n") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayHello();
    }
}
