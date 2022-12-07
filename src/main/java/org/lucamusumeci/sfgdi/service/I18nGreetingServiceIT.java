package org.lucamusumeci.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("IT")
@Service("I18n")
public class I18nGreetingServiceIT implements GreetingService {
    @Override
    public String sayHello() {
        return "Ciao";
    }
}
