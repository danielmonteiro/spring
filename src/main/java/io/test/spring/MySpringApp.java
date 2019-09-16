package io.test.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("basketballCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

        context.close();
    }

}
