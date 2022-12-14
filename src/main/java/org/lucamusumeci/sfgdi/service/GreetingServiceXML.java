package org.lucamusumeci.sfgdi.service;

public class GreetingServiceXML implements GreetingService {
    @Override
    public String sayHello() {
        return "I'm " + this.getClass().getSimpleName();
    }
}
