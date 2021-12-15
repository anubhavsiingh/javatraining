package com.coforge.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springdemo.model.Developer;


/**
 * Hello world!
 *
 */
public class DeveloperApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext appCon = new ClassPathXmlApplicationContext("DeveloperConfig.xml");
    	
    	Developer factory = (Developer)appCon.getBean("d1");
    	factory.display();
    	//System.out.println("I am working from "+factory.getCity());
    }
}
