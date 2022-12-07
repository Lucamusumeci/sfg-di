package org.lucamusumeci.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServicePoliteImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Salutations!";
    }
}
