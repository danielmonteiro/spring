package io.test.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class AnotherAnnotatedBean implements ParentBean {

  public String getSmth() {
    return "Another";
  }

}
