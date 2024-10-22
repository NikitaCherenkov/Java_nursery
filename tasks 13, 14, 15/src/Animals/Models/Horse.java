package Animals.Models;

import Animals.Pack;

import java.time.LocalDate;

public class Horse extends Pack {
    public Horse(String name, LocalDate birthday) {
        super("Лошадь", name, birthday);
    }
}
