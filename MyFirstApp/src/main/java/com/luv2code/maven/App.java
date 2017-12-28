package com.luv2code.maven;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Configure.class);
        Coach c = context.getBean("thatCoach",Coach.class);

        System.out.println(c.getDailyWorkout());
        System.out.println(c.getDailyFortune());

        context.close();




    }
}
