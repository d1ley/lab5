package me.diley;

import java.util.Scanner;

public class Menu {

    private static Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {

        int choice;
        do {

            System.out.println("Menu:");
            System.out.println("(1) Wprowadź macierze wejściowe");
            System.out.println("(2) Operacje arytmetyczne");
            System.out.println("(3) Wyświetl macierze");
            System.out.println("(0) Wyjście");

            choice = Menu.getUserChoice();

            switch (choice) {
                case 1:
                    Model.inputMatrices();
                    break;
                case 2:
                    Menu.arithmeticOperationsMenu();
                    break;
                case 3:
                    Menu.displayInputMatrices(Model.matrixA, Model.matrixB);
                    break;
                case 0:
                    System.out.println("Wyjście z programu.");

                    break;
                default:
                    System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }

        } while (choice != 0);

    }

    public static void displayInputMatrices(double[][] matrixA, double[][] matrixB) {

        if (Model.matrixA != null && Model.matrixB != null) {
        System.out.println("Macierz A: ");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Macierz B: ");
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.println();
        }
        } else {
            System.out.println("Nie wprowadzono macierzy wejściowych.");
        }
    }

    public static void arithmeticOperationsMenu() {

        if (Model.matrixA != null && Model.matrixB != null) {
            int choice;

            do {
                System.out.println("Menu operacji arytmetycznych:");
                System.out.println("(1) Transponowanie macierz wejściowych");
                System.out.println("(2) Mnożenie macierz wejściowych");
                System.out.println("(3) Transponowanie macierzy wynikowej");
                System.out.println("(0) Powrót do menu głównego");

                choice = Menu.getUserChoice();

                switch (choice) {
                    case 1:
                        Model.transposeInputMatrices();
                        break;
                    case 2:
                        Model.multiplyInputMatrices();
                        break;
                    case 3:
                        Model.transposeResultMatrix();
                        break;
                    case 0:
                        System.out.println("Wyjście z programu.");
                        break;
                    default:
                        System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
                }

            } while (choice != 0);

        } else {
            System.out.println("Nie wprowadzono macierzy wejściowych.");
        }
    }

    public static int getUserChoice() {
        System.out.print("Wybierz opcję: ");
        return scanner.nextInt();
    }
}

