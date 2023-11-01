package com.example.calc.Controller;

import com.example.calc.Model.Calculator;


public class CalculatorDecorator implements Calculate {
    protected  Calculator calculator;

    public CalculatorDecorator(Calculator calculator) {
        this.calculator = calculator;
    }



    public Calculator sumNumb(Calculator numberNew) {
        Calculator result = calculator.additionNumbers(numberNew);
        System.out.println(" Log операции сложения:" + calculator + " ->" + numberNew + " = "+ result);
        return result;
    }





    public Calculator multiNumb(Calculator numberNew) {
        Calculator result = calculator.multiplyNumbers(numberNew);
        System.out.println("Log операции умножения:" + calculator + " ->" + numberNew + " = "+ result);
        return result;
    }


    public Calculator divisionNumb(Calculator numberNew) {
        Calculator result = calculator.divisionNumbers(numberNew);
        System.out.println("Log операции деления:" + calculator + " ->" + numberNew + " = "+ result);
        return result;
    }

    public String toString() {
        return calculator.toString();
    }
}
