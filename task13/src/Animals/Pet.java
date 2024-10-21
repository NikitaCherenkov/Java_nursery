package Animals;

import java.time.LocalDate;

public abstract class Pet extends Animal {
    public Pet(String name, LocalDate birthday) {
        super(name, birthday);
    }

    public String getAnimalClass() {
        return "Pet (домашнее)";
    }
}
