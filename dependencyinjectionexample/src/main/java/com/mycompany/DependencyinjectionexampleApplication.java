package com.mycompany;

import com.mycompany.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyinjectionexampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DependencyinjectionexampleApplication.class, args);

		GreetingController controller = (GreetingController) ctx.getBean("greetingController");

		controller.sayHello();
	}
}
