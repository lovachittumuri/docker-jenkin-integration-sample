package com.lova;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinIntegrationSampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinIntegrationSampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(
				"Hello World! This is a sample Spring Boot application running in Docker and integrated with Jenkins.");
		
		System.out.println("Application started successfully.");

	}

}
