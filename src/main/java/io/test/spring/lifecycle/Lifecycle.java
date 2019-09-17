package io.test.spring.lifecycle;

public class Lifecycle {

  public void initMethod() {
    System.out.println("Initializing bean...");
  }

  private void destroyMethod() {
    System.out.println("Bean destroyed!");
  }

}
