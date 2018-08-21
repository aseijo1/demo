package org.kappa.hibernate.job;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages= {"org.kappa.hibernate.job", 
		"org.kappa.hibernate.job.controller", 
		"org.kappa.hibernate.job.repository", 
		"org.kappa.hibernate.job.service",
		"org.kappa.hibernate.job.utils"})
public class AppConfiguration {
 

}
