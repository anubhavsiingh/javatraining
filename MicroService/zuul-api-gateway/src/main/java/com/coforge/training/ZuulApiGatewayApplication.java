package com.coforge.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

//It will acts as a Zuul Service Proxy and will enable Features of API Gateway that
//	Proxies Request to Different Microservices.

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class ZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiGatewayApplication.class, args);
	}
	
	/*Create reverse proxy - Zuul api gateway so that it can forward the requests to other 
	 * microservices by injecting a bean of Zuul Filter.*/
	
	//Simple filter bean is injected
	@Bean
	public SimpleFilter simpleFilter(){
		return new SimpleFilter();
	}
}
