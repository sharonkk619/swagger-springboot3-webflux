package com.swagger.sawggerspringboot3;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Open API implementation with spring webflux"))
public class SwaggerSpringboot3Application {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerSpringboot3Application.class, args);
	}

}
