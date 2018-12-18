package com.in28minutes.springboot.tutorial.basics.application.configuration.springboottutorialbasicsconfiguration;

import com.in28minutes.springboot.tutorial.basics.pojo.Greetings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeResource {

    @Autowired
    private Greetings greetings;

    @RequestMapping(
            value = "/greetings",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Greetings getWelcomeMessage() {
        return greetings;
    }

}
