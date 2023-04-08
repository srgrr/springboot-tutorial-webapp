package es.sergiorgs.springboot.tutorial.demo.webapp.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonOutfitBean {
    @Bean
    public PersonOutfit getPersonOutfit() {
        return new PersonOutfit(
                "sexy pants",
                "sexy shirt",
                "sexy shoes",
                "sexy hat"
        );
    }
}
