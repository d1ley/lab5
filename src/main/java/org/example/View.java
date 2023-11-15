package org.example;//model view controler matrix

import java.util.Scanner;

public class View {

    private static Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {

        System.out.println("Menu:");
        System.out.println("(1) Wprowadź macierze wejściowe");
        System.out.println("(2) Operacje arytmetyczne");
        System.out.println("(3) Wyświetl macierze");
        System.out.println("(0) Wyjście");

        int choice;

        do {
            choice = View.getUserChoice();

            switch (choice) {
                case 1:
                    Model.inputMatrices();
                    break;
                case 2:
                    Model.arithmeticOperationsMenu();
                    break;
                case 3:
                    Model.displayInputMatrices();
                    break;
                case 0:
                    View.displayMessage("Wyjście z programu.");
                    break;
                default:
                    View.displayMessage("Nieprawidłowy wybór. Spróbuj ponownie.");
            }

        } while (choice != 0);

    }

    public static int getUserChoice() {
        System.out.print("Wybierz opcję: ");
        return scanner.nextInt();
    }

    public static void displayMessage(String message) {
        System.out.println(message);
    }


}

