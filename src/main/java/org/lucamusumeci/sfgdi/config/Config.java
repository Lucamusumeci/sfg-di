package org.lucamusumeci.sfgdi.config;

import org.lucamusumeci.sfgdi.datasource.FakeDataSourceWithConstructorBinding;
import org.lucamusumeci.sfgdi.service.GreetingService;
import org.lucamusumeci.sfgdi.service.GreetingServiceConfig;
import org.lucamusumeci.sfgdi.service.GreetingServiceFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

@EnableConfigurationProperties(FakeDataSourceWithConstructorBinding.class)
@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class Config {

    @Bean
    public GreetingServiceFactory greetingServiceFactory(){
        return new GreetingServiceFactory();
    }

    @Profile({"en","default"})
    @Bean("I18n")
    public GreetingService englishGreetingsService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.getGreetingService("en");
    }

    @Bean
    public GreetingServiceConfig methodThatDefinesTheBeanForAService(){
        return new GreetingServiceConfig();
    }
}
