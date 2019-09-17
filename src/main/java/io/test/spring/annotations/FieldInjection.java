package io.test.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class FieldInjection implements FieldInjectionParent {

  public String getText() {
    return "Any text";
  }

}
