package org.lucamusumeci.sfgdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Greetings! I'm the Primary service.";
    }
}
