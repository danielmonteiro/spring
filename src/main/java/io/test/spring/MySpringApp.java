package io.test.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        SoccerCoach coach = context.getBean("myCoach", SoccerCoach.class);
        SoccerCoach coach2 = context.getBean("myCoach", SoccerCoach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach2.getDailyWorkout());

        coach2.setEmail("new@email.com");

        System.out.println(" -------------------------------- ");
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach2.getDailyWorkout());

        context.close();
    }

}
