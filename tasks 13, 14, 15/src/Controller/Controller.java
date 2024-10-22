package Controller;

import Animals.Animal;
import Animals.Types;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Animal> animals = new ArrayList<>();
    public void addAnimal(int type, String name, LocalDate birthday) {
        Types[] types = Types.values();
        try {
            animals.add(Types.selectAnimal(types[type], name, birthday));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getAnimalsAsString(int correctionOfPrintedIndex) {
        if (animals.size() == 0) return "Список пуст";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < animals.size(); i++) {
            sb.append(String.format("%d - %s", i + correctionOfPrintedIndex, animals.get(i).toString()));
            if (i < animals.size() - 1) sb.append("\n");
        }
        return sb.toString();
    }

    public String getCommandsAsString(int animalIndex) {
        List<String> commands = animals.get(animalIndex).getCommands();
        if (commands.size() == 0) return "Список пуст";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < commands.size(); i++) {
            sb.append(commands.get(i));
            if (i < commands.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }

    public void addNewCommand(int animalIndex, String command) {
        animals.get(animalIndex).addCommand(command);
    }
}
