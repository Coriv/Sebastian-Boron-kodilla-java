package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){

        Calculator calculator = new Calculator();

        int addResult = calculator.add(4,6);
        int substractResult = calculator.substract(3,1);

        if(addResult == 10 && substractResult == 2)
            System.out.println("Test OK");
        else
            System.out.print("Error");

    }
}
