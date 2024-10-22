package View;

import Animals.Types;
import Controller.Controller;
import Controller.Counter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Scanner;

public class View {
    Controller controller = new Controller();
    final Scanner in = new Scanner(System.in);
    public void begin() {
        try (in; Counter counter = new Counter()) {
            String choise = "";
            while (!Objects.equals(choise, "0")) {
                System.out.println("""
                        Выберите действие:
                        1 - Вывести список всех животных
                        2 - Завести новое животное
                        3 - Вывести список изученных команд
                        4 - Добавить новую команду
                        5 - Вывести количество добавленных животных
                        0 - Выход""");
                choise = in.next();
                switch (choise) {
                    case "1" -> {
                        printListAnimals(1);
                    }
                    case "2" -> {
                    try {
                        createAnimal();
                        counter.increase();
                        System.out.println("Успешно добавлено");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    }
                    case "3" -> {
                        printListCommands();
                    }
                    case "4" -> {
                        addNewCommand();
                    }
                    case "5" -> {
                        System.out.println(String.format("Животных добавлено: %d", counter.getCount()));
                    }
                    default -> {}
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void printListAnimals(int correctionOfPrintedIndex) {
        System.out.println(controller.getAnimalsAsString(correctionOfPrintedIndex) + "\n");
    }

    private int choiseIndexOfExistingAnimal() {
        printListAnimals(1);
        System.out.print("Введите номер животного: ");
        return in.nextInt() - 1;
    }

    private void createAnimal() {
        for (Types type:Types.values()) {
            System.out.printf("%d - %s%n", type.ordinal() + 1, type);
        }
        System.out.print("Введите номер животного: ");
        int choise = in.nextInt() - 1;
        System.out.println("Введите имя животного");
        in.nextLine();
        String name = in.nextLine();
        System.out.println("Введите дату рождения животного в формате 'dd.mm.yyyy': ");
        LocalDate birthday = LocalDate.parse(in.nextLine(), DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        controller.addAnimal(choise, name, birthday);
    }

    private void printListCommands() {
        int index = choiseIndexOfExistingAnimal();
        System.out.println(String.format("Животное знает следующие команды:\n%s",
                controller.getCommandsAsString(index)));
    }

    private void addNewCommand() {
        int index = choiseIndexOfExistingAnimal();
        System.out.println("Введите новую команду: ");
        in.nextLine();
        String command = in.nextLine();
        controller.addNewCommand(index, command);
    }
}
