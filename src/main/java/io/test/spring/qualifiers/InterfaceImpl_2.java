package io.test.spring.qualifiers;

import org.springframework.stereotype.Component;

@Component
public class InterfaceImpl_2 implements Interface {

  public String getQualifierName() {
    return "Second implementation";
  }

}
