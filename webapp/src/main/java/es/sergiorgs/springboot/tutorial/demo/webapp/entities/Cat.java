package es.sergiorgs.springboot.tutorial.demo.webapp.entities;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
    @Override
    public String getSound() {
        return "meow";
    }

    @Override
    public int petAndCount() {
        return 0;
    }
}
