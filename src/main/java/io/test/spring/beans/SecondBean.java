package io.test.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class SecondBean {

    public String getSecondBeanName() {
        return "I'm second bean from @Bean";
    }
}
