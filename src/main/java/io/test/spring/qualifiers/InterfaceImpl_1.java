package io.test.spring.qualifiers;

import org.springframework.stereotype.Component;

@Component
public class InterfaceImpl_1 implements Interface {

  public String getQualifierName() {
    return "First implementation";
  }

}
