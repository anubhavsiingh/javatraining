package com.coforge.training;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
	
	@Bean
	@LoadBalanced  //Rest Template has client load balancing capabilities
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
