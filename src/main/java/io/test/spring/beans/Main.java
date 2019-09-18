package io.test.spring.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        FirstBean firstBean = context.getBean("firstBean", FirstBean.class);

        System.out.println(firstBean.getBeanName());
        System.out.println(firstBean.getSecondBeanName());

        context.close();
    }

}
