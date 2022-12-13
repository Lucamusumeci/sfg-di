package org.lucamusumeci.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile({"EN","default"})
//@Service("I18n")
public class I18nGreetingServiceEN implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello";
    }
}
