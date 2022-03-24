package com.coforge.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//Service Registry

/*Service Registry is the process of registering a microservice with Eureka Server.
In a nutshell, it acts as a kind of database which stores the details of all
 microservices involved in the entire application. However, this is also a regular Spring Boot
  application. In order to enable the service registry, we apply annotation @EnableEurekaServer
   on the top of the Application’s main class. Moreover, on using Spring Cloud’s annotation 
   @EnableEurekaServer, other microservices can register here and communicate with each
    other via service discovery.*/

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer100Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer100Application.class, args);
	}

}
