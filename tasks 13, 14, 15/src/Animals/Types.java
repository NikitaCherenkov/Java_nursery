package Animals;

import Animals.Models.*;

import java.time.LocalDate;

public enum Types {
    DOG,
    CAT,
    HAMSTER,
    CAMEL,
    DONKEY,
    HORSE;

    public static Animal selectAnimal(Types type, String name, LocalDate birthdayDate) {
        switch (type) {
            default -> { return null; }
            case DOG -> { return new Dog(name, birthdayDate); }
            case CAT -> { return new Cat(name, birthdayDate); }
            case HAMSTER -> { return new Hamster(name, birthdayDate); }
            case CAMEL -> { return new Camel(name, birthdayDate); }
            case DONKEY -> { return new Donkey(name, birthdayDate); }
            case HORSE -> { return new Horse(name, birthdayDate); }
        }
    }
}
