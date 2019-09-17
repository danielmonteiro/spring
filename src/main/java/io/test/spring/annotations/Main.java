package io.test.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");

    ParentBean annotated = context.getBean("annotatedBean", ParentBean.class);
    ParentBean another = context.getBean("anotherAnnotatedBean", ParentBean.class);

    System.out.println(annotated.getSmth());
    System.out.println(another.getSmth());

  }

}
