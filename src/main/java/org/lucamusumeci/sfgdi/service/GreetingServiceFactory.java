package org.lucamusumeci.sfgdi.service;

public class GreetingServiceFactory {

    public GreetingService getGreetingService(String greetingServiceType){
        return switch (greetingServiceType) {
            case "en" -> new I18nGreetingServiceEN();
            case "it" -> new I18nGreetingServiceIT();
            default -> new I18nGreetingServiceEN();
        };
    }
}
