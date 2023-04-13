package es.sergiorgs.springboot.tutorial.demo.webapp.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
public class Person {
    @Id
    @Column(name = "ID_CARD")
    private String idCard;
    @Column(name = "FULL_NAME")
    private String fullName;

    public Person(String idCard, String fullName) {
        this.idCard = idCard;
        this.fullName = fullName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
