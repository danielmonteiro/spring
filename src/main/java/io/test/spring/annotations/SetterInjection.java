package io.test.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class SetterInjection implements SetterInjectionParent {

  public String someString() {
    return "Injected by setter!";
  }

}
