package es.sergiorgs.springboot.tutorial.demo.webapp.rest;

import es.sergiorgs.springboot.tutorial.demo.webapp.bean.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    private final Animal animal;

    @Value("${cat.name}")
    private String catName;

    @GetMapping("/")
    public String sayHello() {
        return catName;
    }

    @GetMapping("/animal_sound")
    public String getAnimalSound() {
        return animal.getSound();
    }

    // added whilst running to check if devtools reflected changes
    @GetMapping("/detailed")
    public String detailedCatName() {
        return "My cat's name is " + catName;
    }

    // This constructor is supposed to figure out that I want a cat
    // as Animal is only implemented by Cat
    @Autowired
    public FunRestController(Animal animal) {
        this.animal = animal;
    }
}
