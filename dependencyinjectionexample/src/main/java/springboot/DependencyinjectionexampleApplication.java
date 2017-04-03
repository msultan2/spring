package springboot;

import com.mycompany.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan("com.mycompany")
public class DependencyinjectionexampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DependencyinjectionexampleApplication.class, args);

		GreetingController controller = (GreetingController) ctx.getBean("greetingController");

		controller.sayHello();
	}
}
