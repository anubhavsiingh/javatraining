package com.coforge.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springdemo.model.Student;

/**
 * Hello world!
 *
 */
public class HelloWorldApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext appCon = new ClassPathXmlApplicationContext("StudentConfig.xml");
    	
    	Student factory = (Student)appCon.getBean("s1");
    	factory.display();
    }
}
