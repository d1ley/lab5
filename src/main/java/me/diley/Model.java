package org.example;

import java.util.Scanner;


public class Model {

    private static Scanner scanner = new Scanner(System.in);
    static double[][] matrixA;
    static double[][] matrixB;

    public static void inputMatrices() {

        int rowsA;
        int colsA;
        int rowsB;
        int colsB;

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

    public static void transposeInputMatrices() {
        if (matrixA != null && matrixB != null) {
            matrixA = transpose(matrixA);
            matrixB = transpose(matrixB);
            System.out.println("Macierze wejściowe zostały transponowane.");
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
            System.err.println("Błąd: Macierze wejściowe nie zostały jeszcze zainicjowane.");
        }
    }

    private static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        double[][] transposedMatrix = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }


    public static void multiplyInputMatrices() {
        if (matrixA != null && matrixB != null) {
            if (matrixA[0].length == matrixB.length) {
                double[][] resultMatrix = new double[matrixA.length][matrixB[0].length];

                for (int i = 0; i < matrixA.length; i++) {
                    for (int j = 0; j < matrixB[0].length; j++) {
                        for (int k = 0; k < matrixA[0].length; k++) {
                            resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                        }
                    }
                }

                System.out.println("Macierz wynikowa: ");
                for (int i = 0; i < resultMatrix.length; i++) {
                    for (int j = 0; j < resultMatrix[0].length; j++) {
                        System.out.print(resultMatrix[i][j] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.err.println("Błąd: Liczba kolumn macierzy A musi być równa liczbie wierszy macierzy B.");
            }
        } else {
            System.err.println("Błąd: Macierze wejściowe nie zostały jeszcze zainicjowane.");
        }

    }

    public static void transposeResultMatrix() {
        if (matrixA != null && matrixB != null) {
            if (matrixA[0].length == matrixB.length) {
                double[][] resultMatrix = new double[matrixA.length][matrixB[0].length];

                for (int i = 0; i < matrixA.length; i++) {
                    for (int j = 0; j < matrixB[0].length; j++) {
                        for (int k = 0; k < matrixA[0].length; k++) {
                            resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                        }
                    }
                }

                resultMatrix = transpose(resultMatrix);

                System.out.println("Macierz wynikowa: ");
                for (int i = 0; i < resultMatrix.length; i++) {
                    for (int j = 0; j < resultMatrix[0].length; j++) {
                        System.out.print(resultMatrix[i][j] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.err.println("Błąd: Liczba kolumn macierzy A musi być równa liczbie wierszy macierzy B.");
            }
        } else {
            System.err.println("Błąd: Macierze wejściowe nie zostały jeszcze zainicjowane.");
        }

    }
}


