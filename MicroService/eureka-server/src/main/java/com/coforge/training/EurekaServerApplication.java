package com.coforge.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*@EnableEurekaServer annotation indicates that we want to run a Eureka Server.
By seeing a dependency on Spring Cloud Eureka, Spring Boot automatically configures the 
application as a service registry.*/

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
