package es.sergiorgs.springboot.tutorial.demo.webapp.entities;


public class PersonOutfit {
    private final String pants;
    private final String shirt;
    private final String shoes;
    private final String hat;


    public PersonOutfit(
            String pants,
            String shirt,
            String shoes,
            String hat
    ) {
        this.pants = pants;
        this.shirt = shirt;
        this.shoes = shoes;
        this.hat = hat;
    }

    public String getPants() {
        return pants;
    }

    public String getShirt() {
        return shirt;
    }

    public String getShoes() {
        return shoes;
    }

    public String getHat() {
        return hat;
    }

    @Override
    public String toString() {
        return "PersonOutfit{" +
                "pants='" + pants + '\'' +
                ", shirt='" + shirt + '\'' +
                ", shoes='" + shoes + '\'' +
                ", hat='" + hat + '\'' +
                '}';
    }
}
