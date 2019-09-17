package io.test.spring.qualifiers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextQualifiers.xml");

    Base base = context.getBean("base", Base.class);
    System.out.println(base.getQualifierName());

    context.close();
  }

}
