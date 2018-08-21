package org.kappa.hibernate.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
/*@Configuration
@EnableAutoConfiguration*/
/*@ComponentScan(basePackages= {"org.kappa.hibernate.job", 
		"org.kappa.hibernate.job.controller", 
		"org.kappa.hibernate.job.repository", 
		"org.kappa.hibernate.job.service"})*/
public class MainApp {

	public static void main(String[] args) {

		SpringApplication.run(MainApp.class, args);
	}
	
}
