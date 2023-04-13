package es.sergiorgs.springboot.tutorial.demo.webapp.rest;

import es.sergiorgs.springboot.tutorial.demo.webapp.entities.Animal;
import es.sergiorgs.springboot.tutorial.demo.webapp.entities.Person;
import es.sergiorgs.springboot.tutorial.demo.webapp.entities.PersonOutfit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RestController
public class FunRestController {

    private Animal animal;

    private PersonOutfit personOutfit;

    @PersistenceContext(unitName = "local")
    private EntityManager entityManager;

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

    @PostMapping("/add_person")
    public void addPerson(String idCard, String fullName) {
        entityManager.persist(new Person(idCard, fullName));
    }

    @GetMapping("/get_person")
    public String getPerson(String idCard) {
        Person p = entityManager.find(Person.class, idCard);
        return p.getFullName();
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
