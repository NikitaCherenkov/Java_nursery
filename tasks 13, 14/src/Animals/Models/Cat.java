package Animals.Models;

import Animals.Pet;

import java.time.LocalDate;

public class Cat extends Pet {
    public Cat(String name, LocalDate birthday) {
        super("Кот", name, birthday);
    }
}
