package Animals;

import java.time.LocalDate;

public abstract class Animal {
    private String name;
    private String command;
    private LocalDate birthdayDate;

    public Animal(String name, LocalDate birthday) {
        this.name = name;
        this.birthdayDate = birthday;
    }

    public String getName() {
        return name;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    public void setBirthdayDate(LocalDate date) {
        this.birthdayDate = date;
    }

    public LocalDate getBirthdayDate(){
        return birthdayDate;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
