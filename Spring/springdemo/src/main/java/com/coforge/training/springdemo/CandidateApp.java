package com.coforge.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springdemo.model.Candidate;

/**
 * Hello world!
 *
 */
public class CandidateApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext appCon = new ClassPathXmlApplicationContext("CandidateConfig.xml");
    	
    	Candidate factory = (Candidate)appCon.getBean("candidate1");
    	factory.disp();
    }
}
