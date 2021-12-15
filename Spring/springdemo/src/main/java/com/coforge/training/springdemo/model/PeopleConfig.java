package com.coforge.training.springdemo.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Configure Spring Beans without XML
//DI using Setter by Annotations

/*@Configuration annotation indicates that a class declares one or more @Bean
 *  methods and may be processed by the Spring container to generate
 *  bean definitions and service requests for those beans at runtime.*/

/*The @ComponentScan annotation is used with the @Configuration annotation 
 * to tell Spring the packages to scan for annotated components.*/

/*    @Bean is a method-level annotation and a direct analog of the XML 
 * <bean/> element. */


@Configuration
@ComponentScan("com.coforge.training.springdemo.model")
public class PeopleConfig {
	
	@Bean(name="People")
	//@Bean
	public People getPeople() {
		People p = new People();
		p.setName("Anubhav");
		p.setAge(21);
		return p;
	}
	
}
