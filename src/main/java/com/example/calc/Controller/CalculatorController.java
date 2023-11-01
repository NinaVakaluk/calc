package com.example.calc.Controller;

import com.example.calc.Model.Calculator;
import com.example.calc.View.CalculatorInput;


public class CalculatorController {
    private CalculatorInput calculatorInput;

    public CalculatorController(CalculatorInput calculatorInput) {
        this.calculatorInput = calculatorInput;
    }

    public void realizeCalculate() {

        double Real1 = calculatorInput.getRealInput("первое вещественное число");
        double Imaginary1 = calculatorInput.getImaginaryInput("первое мнимое число");

        double Real2 = calculatorInput.getRealInput("второе вещественное число");
        double Imaginary2 = calculatorInput.getImaginaryInput("второе мнимое число");

        Calculator number1 = new Calculator(Real1, Imaginary1);
        Calculator number2 = new Calculator(Real2, Imaginary2);

        Calculate checkLogs = new CalculatorDecorator(number1);

        int choice = CalculatorInput.getChoice();

        Calculator result;

        if (choice == 1) {
            result = checkLogs.sumNumb(number2);
            calculatorInput.displayResult(" Результат сложения  = " + result);

        } else if (choice == 2) {
            result = checkLogs.multiNumb(number2);
            calculatorInput.displayResult("  Результат умножения  = " + result);
        } else if (choice == 3) {
            result = checkLogs.divisionNumb(number2);
            calculatorInput.displayResult(" Результат деления  = " + result);
        } else {
            calculatorInput.displayResult(" Неккоректное значение.Введите снова ");
        }
        calculatorInput.closeScanner();
    }
}

