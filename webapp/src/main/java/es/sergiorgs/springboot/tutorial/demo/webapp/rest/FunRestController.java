package es.sergiorgs.springboot.tutorial.demo.webapp.rest;

import es.sergiorgs.springboot.tutorial.demo.webapp.bean.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    private Animal animal;

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

    // This setter is supposed to figure out that I want a cat
    // as Animal is only implemented by Cat
    // Can also be switched to a constructor and it will still work
    @Autowired
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
