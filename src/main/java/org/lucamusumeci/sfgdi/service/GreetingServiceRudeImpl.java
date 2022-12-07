package org.lucamusumeci.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceRudeImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Fuck you!";
    }
}
