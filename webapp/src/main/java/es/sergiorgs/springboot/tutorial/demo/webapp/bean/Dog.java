package es.sergiorgs.springboot.tutorial.demo.webapp.bean;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    @Override
    public String getSound() {
        return "woof";
    }
}
