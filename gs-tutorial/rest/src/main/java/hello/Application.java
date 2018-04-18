// https://spring.io/guides/gs/rest-service/#initial

package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// annotation that adds @Configuration, @EnableAutoConfig, @EnableWebMvc, @ComponentScan
@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		// A Spring Boot application to launch application
		SpringApplication.run(Application.class, args);
	
	}
}
