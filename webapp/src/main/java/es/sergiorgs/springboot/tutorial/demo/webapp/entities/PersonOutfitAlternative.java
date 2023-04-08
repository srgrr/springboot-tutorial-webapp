package es.sergiorgs.springboot.tutorial.demo.webapp.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonOutfitAlternative {
    @Bean
    public PersonOutfit getAlternativeOutfit() {
        return new PersonOutfit(
                "ugly pants",
                "ugly shirt",
                "ugly shoes",
                "ugly hat"
        );
    }
}
