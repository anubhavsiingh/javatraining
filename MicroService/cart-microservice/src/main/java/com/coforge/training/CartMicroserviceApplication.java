package com.coforge.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/*In order to make your application/microservice acts as a Eureka discovery client, you need to apply
 *  @EnableEurekaClient at the main class of your application.*/

@EnableEurekaClient
@SpringBootApplication
public class CartMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartMicroserviceApplication.class, args);
	}

}
