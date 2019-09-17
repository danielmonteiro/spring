package io.test.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");

    ParentBean annotated = context.getBean("annotatedBean", ParentBean.class);
    ParentBean another = context.getBean("anotherAnnotatedBean", ParentBean.class);

    System.out.println(annotated.getSmth());
    System.out.println(another.getSmth());

    System.out.println("===============================================");

    SoccerCoach soccerCoach = context.getBean("soccerCoach", SoccerCoach.class);
    System.out.println(soccerCoach.getTeamName());
    System.out.println(soccerCoach.getFortune());


    System.out.println("===============================================");

    SetterInjectionBase setterInjectionBase = context.getBean("setterInjectionBase", SetterInjectionBase.class);
    System.out.println(setterInjectionBase.getString());

    System.out.println("===============================================");

    FieldInjectionBase fieldInjectionBase = context.getBean("fieldInjectionBase", FieldInjectionBase.class);
    System.out.println(fieldInjectionBase.getText());

    context.close();
  }

}
