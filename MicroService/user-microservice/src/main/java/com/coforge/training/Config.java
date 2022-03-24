package com.coforge.training;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
	
	/* Once you have this Load balanced restTemplate instance then you can use the logical name of the
	 *  service, in the URL, that was used to register it with Eureka. Rest template can use the logical
	 *   name of service i.e ACCOUNT, Instead of localhost:9002 */
	
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
