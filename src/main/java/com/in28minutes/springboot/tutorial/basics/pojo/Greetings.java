package com.in28minutes.springboot.tutorial.basics.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
public class Greetings {

    @Value("${welcome.message}")
    private String message;

    @Value("${welcome.luckyNumber}")
    private long luckyNumber;
}
