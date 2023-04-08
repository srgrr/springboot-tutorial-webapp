package es.sergiorgs.springboot.tutorial.demo.anotherpackage;

import es.sergiorgs.springboot.tutorial.demo.webapp.entities.Animal;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnotherRestController {

    private Animal animal1;
    private Animal animal2;

    private String pet(Animal animal) {
        return "You've pet me " + animal.petAndCount() + " times!";
    }

    @GetMapping("/pet1")
    public String pet1() {
        return pet(animal1);
    }

    @GetMapping("/pet2")
    public String pet2() {
        return pet(animal2);
    }

    // This constructor should receive a dog
    // since it's the @Primary impl
    @Autowired
    public AnotherRestController(Animal animal1, Animal animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
    }

    @PostConstruct
    public void petDogOneTime() {
        animal1.petAndCount();
    }
}
