package cz.trask.mnemeckova.training.spring.employeemanager;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

// Created according to course https://www.youtube.com/watch?v=Gx4iBLKLVHk (Spring Boot Full Stack with Angular) by Amigoscode

@SpringBootApplication
@EntityScan("cz.trask.mnemeckova.training.spring.employeemanager.model")	//sometimes needed when model is in different package than @SpringBootApplication
public class EmployeemanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeemanagerApplication.class, args);
	}
}
