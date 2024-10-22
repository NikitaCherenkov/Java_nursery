package Animals.Models;

import Animals.Pet;

import java.time.LocalDate;

public class Dog extends Pet {
    public Dog(String name, LocalDate birthday) {
        super("Собака", name, birthday);
    }
}
