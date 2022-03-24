package com.coforge.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import brave.sampler.Sampler;

@Configuration
public class AppConfig {
	
	//Collects data from Sleuth and provides it to Zipkin Client
	@Bean
	public Sampler samplerOb() {

	return Sampler.ALWAYS_SAMPLE;
	}
}
