package com.mycompany.config;

import com.mycompany.services.HelloWorldEnglishImpl;
import com.mycompany.services.HelloWorldService;
import com.mycompany.services.HelloWorldSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by mohamedsultan on 03/04/2017.
 */

@Configuration
public class HelloConfig {

    @Bean
    @Profile({"default","english"})
    public HelloWorldService helloWorldServiceEnglish(){
        return new HelloWorldEnglishImpl();
    }

    @Bean
    @Profile({"spanish"})
    public HelloWorldService helloWorldServiceSpanish(){
        return new HelloWorldSpanishImpl();
    }

}
