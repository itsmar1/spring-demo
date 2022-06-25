package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeSpringApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScopePractice-applicationContext.xml");

        Coach theCoach = context.getBean("mySoccerCoach", Coach.class);
        Coach anotherCoach = context.getBean("mySoccerCoach", Coach.class);

        boolean result = (theCoach == anotherCoach);

        System.out.println("Reference to same object: " + result);

        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for anotherCoach: " + anotherCoach);

        context.close();

    }
}
