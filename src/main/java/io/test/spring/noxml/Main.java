package io.test.spring.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigComponentScan.class);

    BeanComponentScan beanComponentScan = context.getBean("beanComponentScan", BeanComponentScan.class);
    System.out.println(beanComponentScan.getBeanName());

    context.close();
  }

}
