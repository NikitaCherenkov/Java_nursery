package Animals;

import Animals.Animal;

import java.time.LocalDate;

public abstract class Pack extends Animal {
    public Pack(String className, String name, LocalDate birthday) {
        super(className, name, birthday);
    }

    public String getAnimalClass() {
        return "Pack (вьючное)";
    }
}
