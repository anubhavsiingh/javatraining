package com.coforge.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@EnableZuulProxy //It will act as zuul service proxy and will enable features of API Gateway that Proxies request to different microservices.
@SpringBootApplication
public class ZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiGatewayApplication.class, args);
	}
	
	/*Create reverse proxy - Zuul api gateway so that it can forward the requests to other microservices by injecting a bean of Zuul Filter.*/

	//Simple Filter Bean is Injected to Starter Class
	@Bean
	public SimpleFilter simpleFilter() {
		
		return new SimpleFilter();
	}
}
