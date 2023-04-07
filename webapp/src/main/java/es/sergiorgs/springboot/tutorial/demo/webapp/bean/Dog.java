package es.sergiorgs.springboot.tutorial.demo.webapp.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dog implements Animal {
    @Override
    public String getSound() {
        return "woof";
    }
}
