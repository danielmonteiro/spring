package io.test.spring.noxml;

import org.springframework.stereotype.Component;

@Component
public class BeanComponentScan {

  public String getBeanName() {
    return "I'm a bean from component scan!";
  }

}
