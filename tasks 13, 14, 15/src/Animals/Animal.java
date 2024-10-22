package Animals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private String name;
    private List<String> commands;
    private LocalDate birthdayDate;
    private String className;

    public Animal(String className, String name, LocalDate birthday) {
        this.className = className;
        this.name = name;
        this.birthdayDate = birthday;
        this.commands = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCommand(String newCommand) {
        commands.add(newCommand);
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setBirthdayDate(LocalDate date) {
        this.birthdayDate = date;
    }

    public LocalDate getBirthdayDate(){
        return birthdayDate;
    }

    @Override
    public String toString() {
        return String.format("[%s] Имя: %s; дата рождения: %s", className, name, birthdayDate);
    }
}
