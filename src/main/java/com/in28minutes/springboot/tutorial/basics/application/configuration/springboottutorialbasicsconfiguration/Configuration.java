package com.in28minutes.springboot.tutorial.basics.application.configuration.springboottutorialbasicsconfiguration;

import com.in28minutes.springboot.tutorial.basics.pojo.Greetings;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public Greetings getGreetings() {
        return new Greetings();
    }
}
