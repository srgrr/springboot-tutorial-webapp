package es.sergiorgs.springboot.tutorial.demo.webapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${cat.name}")
    private String catName;

    @GetMapping("/")
    public String sayHello() {
        return catName;
    }

    // added whilst running to check if devtools reflected changes
    
    @GetMapping("/detailed")
    public String detailedCatName() {
        return "My cat's name is " + catName;
    }
}
