package io.test.spring.qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Base {

  private Interface anInterface;

  @Autowired
  public Base(@Qualifier("interfaceImpl_2") Interface anInterface) {
    this.anInterface = anInterface;
  }

  public String getQualifierName() {
    return anInterface.getQualifierName();
  }
}
