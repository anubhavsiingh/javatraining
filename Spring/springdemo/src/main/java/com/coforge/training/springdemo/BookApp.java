package com.coforge.training.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springdemo.model.Book;


public class BookApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext appCon = new ClassPathXmlApplicationContext("BookConfig.xml");
    	
    	Book factory = (Book)appCon.getBean("b1");
    	factory.show();
    	//System.out.println("I am working from "+factory.getCity());
    }
}
