package Animals.Models;

import Animals.Pet;

import java.time.LocalDate;

public class Hamster extends Pet {
    public Hamster(String name, LocalDate birthday) {
        super("Хомяк", name, birthday);
    }
}
