package com.coforge.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springdemo.model.Faculty;

/**
 * Hello world!
 *
 */
public class FacultyApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext appCon = new ClassPathXmlApplicationContext("FacultyConfig.xml");
    	
    	Faculty factory = (Faculty)appCon.getBean("f1");
    	factory.display();
    }
}
