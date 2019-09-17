package io.test.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldInjectionBase {

  @Autowired
  private FieldInjection field;

  public String getText() {
    return field.getText();
  }

}
