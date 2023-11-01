package com.example.calc.Controller;

import com.example.calc.Model.Calculator;


public interface Calculate {
    Calculator sumNumb(Calculator numberNew);



    Calculator multiNumb(Calculator numberNew);

    Calculator divisionNumb(Calculator numberNew);

    String toString();
}
