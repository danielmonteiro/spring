package io.test.spring.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextLifecycle.xml");

    Lifecycle lifecycle = context.getBean("lifecycle", Lifecycle.class);

    context.close();
  }

}
