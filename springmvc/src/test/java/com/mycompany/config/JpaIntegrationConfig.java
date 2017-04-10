package com.mycompany.config;

import com.mycompany.bootstrap.SpringJPABootstrap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;

/**
 * Created by mohamedsultan on 10/04/2017.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.mycompany")
public class JpaIntegrationConfig {
}

