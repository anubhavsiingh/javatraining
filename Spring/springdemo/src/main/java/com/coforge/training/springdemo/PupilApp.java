package com.coforge.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springdemo.model.Pupil;

/**
 * Hello world!
 *
 */
public class PupilApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext appCon = new ClassPathXmlApplicationContext("PupilConfig.xml");
    	
    	Pupil factory = (Pupil)appCon.getBean("p1");
    	System.out.println("Pupil Details.. \nPupil Id : "+factory.getId()+"\nPupil Name : "+factory.getName());
    	factory.showHobbies();
    }
}
