package io.test.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class FirstBean {

    private SecondBean secondBean;

    public FirstBean(SecondBean secondBean) {
        this.secondBean = secondBean;
    }

    public String getBeanName() {
        return "I'm a bean from @Bean!";
    }

    public String getSecondBeanName() {
        return secondBean.getSecondBeanName();
    }

}
