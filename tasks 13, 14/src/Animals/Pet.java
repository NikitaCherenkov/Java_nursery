package Animals;

import java.time.LocalDate;

public abstract class Pet extends Animal {
    public Pet(String className, String name, LocalDate birthday) {
        super(className, name, birthday);
    }

    public String getAnimalClass() {
        return "Pet (домашнее)";
    }
}
