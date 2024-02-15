package com.swagger.sawggerspringboot3;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class SwaggerSpringboot3Application {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerSpringboot3Application.class, args);
	}

}
