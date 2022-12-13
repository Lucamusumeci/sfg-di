package org.lucamusumeci.sfgdi.service;

public class GreetingServiceConfig implements GreetingService {
    @Override
    public String sayHello() {
        return "I'm " + this.getClass().getSimpleName();
    }
}
