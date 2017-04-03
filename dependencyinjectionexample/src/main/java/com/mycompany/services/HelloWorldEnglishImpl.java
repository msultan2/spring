package com.mycompany.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by mohamedsultan on 03/04/2017.
 */

@Component
@Profile("english")
public class HelloWorldEnglishImpl implements HelloWorldService{
    @Override
    public String getGreeting() {
        return "HEllow Worlds";
    }
}
