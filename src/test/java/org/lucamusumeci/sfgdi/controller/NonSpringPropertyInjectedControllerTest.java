package org.lucamusumeci.sfgdi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.lucamusumeci.sfgdi.service.GreetingServiceImpl;

class NonSpringPropertyInjectedControllerTest {
    NonSpringPropertyInjectedController nonSpringPropertyInjectedController;

    @BeforeEach
    void SetUp(){
        nonSpringPropertyInjectedController = new NonSpringPropertyInjectedController();
        nonSpringPropertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void Test(){
        System.out.println(nonSpringPropertyInjectedController.sayHello());
    }

}