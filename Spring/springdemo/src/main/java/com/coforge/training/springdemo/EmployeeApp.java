package com.coforge.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springdemo.model.Employee;

/**
 * Hello world!
 *
 */
public class EmployeeApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext appCon = new ClassPathXmlApplicationContext("EmployeeConfig.xml");
    	
    	Employee factory = (Employee)appCon.getBean("e1");
    	factory.display();
    	System.out.println("I am working from "+factory.getCity());
    }
}
