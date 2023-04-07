package es.sergiorgs.springboot.tutorial.demo.anotherpackage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnotherRestController {
    @GetMapping("/another")
    public String another() {
        return "Hey, you found me!";
    }
}
