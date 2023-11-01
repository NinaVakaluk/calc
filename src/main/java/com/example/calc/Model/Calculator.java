package com.example.calc.Model;


public class Calculator {

    public double numberReal;
    public double numberImaginary;

    public Calculator(double numberReal, double numberImaginaryPart) {
        this.numberReal = numberReal;
        this.numberImaginary = numberImaginaryPart;
    }


    public Calculator additionNumbers(Calculator numberNew) {
        return new Calculator(this.numberReal + numberNew.numberReal,
                this.numberImaginary + numberNew.numberImaginary);
    }


    public Calculator subtractNumbers(Calculator numberNew) {
        return new Calculator(this.numberReal - numberNew.numberReal,
                this.numberImaginary - numberNew.numberImaginary);
    }



    public Calculator multiplyNumbers(Calculator numberNew) {
        double realContainer = (this.numberReal * numberNew.numberReal) -
                (this.numberImaginary * numberNew.numberImaginary);
        double imaginaryContainer = (this.numberReal * numberNew.numberImaginary) +
                (this.numberImaginary * numberNew.numberReal);
        return new Calculator(realContainer, imaginaryContainer);
    }


    public Calculator divisionNumbers(Calculator numberNew) {
        double real = ((this.numberReal * numberNew.numberReal) +
                (this.numberImaginary * numberNew.numberImaginary)) /
                ((numberNew.numberReal * numberNew.numberReal) +
                        (numberNew.numberImaginary * numberNew.numberImaginary));
        double imaginary = ((this.numberImaginary * numberNew.numberReal) -
                (this.numberReal * numberNew.numberImaginary)) /
                ((numberNew.numberReal * numberNew.numberReal) +
                        (numberNew.numberImaginary * numberNew.numberImaginary));
        return new Calculator(real, imaginary);
    }

    @Override
    public String toString() {
        if (numberImaginary >= 0) {
            return numberReal + " + " + numberImaginary + "i";
        } else {
            return numberReal + " - " + Math.abs(numberImaginary) + "i";
        }
    }

}




