package io.test.spring.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

    Bean bean = context.getBean("bean", Bean.class);
    System.out.println(bean.getBeanName());

    context.close();
  }

}
