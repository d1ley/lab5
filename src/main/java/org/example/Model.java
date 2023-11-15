package org.example;

import java.util.Scanner;

public class Model {

    private static double[][] matrixA;
    private static double[][] matrixB;
    private static Scanner scanner = new Scanner(System.in);


    public static void inputMatrices() {

        int rowsA, colsA, rowsB, colsB;

        System.out.println("Podaj liczbę wierszy macierzy A: ");
        rowsA = scanner.nextInt();
        System.out.println("Podaj liczbę kolumn macierzy A: ");
        colsA = scanner.nextInt();

        System.out.println("Podaj liczbę wierszy macierzy B: ");
        rowsB = scanner.nextInt();
        System.out.println("Podaj liczbę kolumn macierzy B: ");
        colsB = scanner.nextInt();

        matrixA = new double[rowsA][colsA];
        matrixB = new double[rowsB][colsB];

        System.out.println("Podaj elementy macierzy A: ");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Podaj elementy macierzy B: ");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = scanner.nextDouble();
            }
        }

    }

    public static void displayInputMatrices() {
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
    }

    public static void arithmeticOperationsMenu() {

    }

    public static void displayMatricesMenu() {


    }




}
