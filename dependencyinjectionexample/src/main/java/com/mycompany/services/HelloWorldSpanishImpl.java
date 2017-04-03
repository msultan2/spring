package com.mycompany.services;

import com.mycompany.controllers.GreetingController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by mohamedsultan on 03/04/2017.
 */
@Component
@Profile("spanish")
public class HelloWorldSpanishImpl implements HelloWorldService{

    private GreetingController greetingController;

    @Override
    public String getGreeting() {
        return "Hola";
    }
}
