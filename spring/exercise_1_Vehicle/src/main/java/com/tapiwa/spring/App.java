package com.tapiwa.spring;

/**
 * Hello world!
 *
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
       //
       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);	

       Vehicle obj = context.getBean(BMW.class);
       obj.make();
    }
}
