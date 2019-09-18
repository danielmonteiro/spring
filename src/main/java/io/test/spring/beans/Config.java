package io.test.spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public SecondBean secondBean() {
        return new SecondBean();
    }

    @Bean
    public FirstBean firstBean() {
        return new FirstBean(secondBean());
    }

}
