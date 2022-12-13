package org.lucamusumeci.sfgdi.config;

import org.lucamusumeci.sfgdi.service.GreetingServiceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public GreetingServiceConfig methodThatDefinesTheBeanForAService(){
        return new GreetingServiceConfig();
    }
}
