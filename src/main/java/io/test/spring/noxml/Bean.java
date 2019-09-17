package io.test.spring.noxml;

import org.springframework.stereotype.Component;

@Component
public class Bean {

  public String getBeanName() {
    return "I'm a bean!";
  }

}
