package io.test.spring.scopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextScopes.xml");

    SingletonScope singleton = context.getBean("singleton", SingletonScope.class);
    SingletonScope singleton2 = context.getBean("singleton", SingletonScope.class);

    System.out.println("singleton: " + singleton.getEmail());
    System.out.println("singleton2: " + singleton2.getEmail());

    singleton2.setEmail("second@email.com");

    System.out.println("--------------------------------------------");
    System.out.println("singleton: " + singleton.getEmail());
    System.out.println("singleton2: " + singleton2.getEmail());

    System.out.println("=============================================");

    PrototypeScope prototype = context.getBean("prototype", PrototypeScope.class);
    PrototypeScope prototype2 = context.getBean("prototype", PrototypeScope.class);

    System.out.println("prototype: " + prototype.getEmail());
    System.out.println("prototype2: " + prototype2.getEmail());

    prototype2.setEmail("new@email.com");

    System.out.println("--------------------------------------------");
    System.out.println("prototype: " + prototype.getEmail());
    System.out.println("prototype2: " + prototype2.getEmail());

    context.close();
  }

}
