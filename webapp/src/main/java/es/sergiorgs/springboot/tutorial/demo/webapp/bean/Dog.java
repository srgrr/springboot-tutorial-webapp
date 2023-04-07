package es.sergiorgs.springboot.tutorial.demo.webapp.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Dog implements Animal {

    int petCounter = 0;

    @Override
    public String getSound() {
        return "woof";
    }

    @Override
    public int petAndCount() {
        return ++petCounter;
    }
}
