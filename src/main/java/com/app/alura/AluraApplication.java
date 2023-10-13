package com.app.alura;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@EntityScan(basePackages = "com.app.Modelo")
@ComponentScan(basePackages = "com.app.controller")

@SpringBootApplication
public class AluraApplication {

	public static void main(String[] args) {
		SpringApplication.run(AluraApplication.class, args);
	}

}
