package com.example.calc.View;

import java.util.Scanner;


public class CalculatorInput {
    private static Scanner scanner = new Scanner(System.in);

    public double getRealInput(String number) {
        System.out.print("Введите " + number + ": ");
        return scanner.nextDouble();
    }

    public double getImaginaryInput(String number) {
        System.out.print("Введите " + number + ": ");
        return scanner.nextDouble();
    }

    public void displayResult(String result) {
        System.out.println("Результат: " + result);
    }

    public void closeScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }


    public static int getChoice() {
        System.out.print("Выберите операцию" + "\n" +
                "  1  -> сложение чисел; " + "\n" +
                "  2  -> умножение чисел; " + "\n" +
                "  3  -> деление чисел; " + "\n" + " Выберите операцию:  ");
        return scanner.nextInt();
    }
}
