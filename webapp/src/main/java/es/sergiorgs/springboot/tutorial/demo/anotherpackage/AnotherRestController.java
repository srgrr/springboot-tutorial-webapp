package es.sergiorgs.springboot.tutorial.demo.anotherpackage;

import es.sergiorgs.springboot.tutorial.demo.webapp.bean.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnotherRestController {

    private Animal animal;

    @GetMapping("/another")
    public String another() {
        return animal.getSound();
    }

    // This constructor should receive a dog
    // since it's the @Primary impl
    @Autowired
    public AnotherRestController(Animal animal) {
        this.animal = animal;
    }
}
