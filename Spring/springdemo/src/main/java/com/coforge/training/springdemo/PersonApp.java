package com.coforge.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springdemo.model.Person;

/**
 * Hello world!
 *
 */
public class PersonApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext appCon = new ClassPathXmlApplicationContext("PersonConfig.xml");
    	
    	Person factory = (Person)appCon.getBean("p1");
    	System.out.println("Person Details.. \nPerson Id : "+factory.getId()+"\nPerson Name : "+factory.getName());
    	factory.showPhoneNos();
    }
}
