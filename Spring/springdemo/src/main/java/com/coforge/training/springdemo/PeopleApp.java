package com.coforge.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springdemo.model.People;
import com.coforge.training.springdemo.model.PeopleConfig;

/**
 * Annotation SI
 *
 */
public class PeopleApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext appCon = new AnnotationConfigApplicationContext(PeopleConfig.class);

		People people = (People)appCon.getBean("People");

    	//People factory = (People)appCon.getBean("people",People.class);
    	people.display();
    	//PeopleConfig p = new PeopleConfig();
    	//System.out.println(p.getPeople());
    }
}
