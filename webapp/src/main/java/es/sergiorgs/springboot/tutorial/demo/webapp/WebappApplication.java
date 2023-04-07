package es.sergiorgs.springboot.tutorial.demo.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {
				"es.sergiorgs.springboot.tutorial.demo.anotherpackage",
				"es.sergiorgs.springboot.tutorial.demo.webapp"
		}
)
public class WebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}

}
