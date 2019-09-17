package io.test.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterInjectionBase {

  private SetterInjection setter;

  @Autowired
  public void setSetter(SetterInjection setter) {
    this.setter = setter;
  }

  public String getString() {
    return setter.someString();
  }
}
