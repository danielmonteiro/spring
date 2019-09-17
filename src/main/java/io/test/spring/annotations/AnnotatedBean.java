package io.test.spring.annotations;

import java.util.UUID;
import org.springframework.stereotype.Component;

@Component
public class AnnotatedBean implements ParentBean {

  public String getSmth() {
    return UUID.randomUUID().toString();
  }

}
