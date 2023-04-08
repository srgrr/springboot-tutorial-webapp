package es.sergiorgs.springboot.tutorial.demo.webapp.rest;

import es.sergiorgs.springboot.tutorial.demo.webapp.entities.Animal;
import es.sergiorgs.springboot.tutorial.demo.webapp.entities.PersonOutfit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    private Animal animal;

    private PersonOutfit personOutfit;

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

    @GetMapping("/person_outfit")
    public String getPersonOutfit() {
        return personOutfit.toString();
    }


    // added whilst running to check if devtools reflected changes
    @GetMapping("/detailed")
    public String detailedCatName() {
        return "My cat's name is " + catName;
    }

    @Autowired
    public FunRestController(
            @Qualifier("cat") Animal animal,
            @Qualifier("getAlternativeOutfit") PersonOutfit personOutfit
    ) {
        this.animal = animal;
        this.personOutfit = personOutfit;
    }
}
