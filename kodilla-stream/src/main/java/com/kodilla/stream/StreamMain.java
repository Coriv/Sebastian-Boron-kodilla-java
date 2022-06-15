package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Arrays;

public class StreamMain {

    public static void main(String[] args) {
        Processor processor = new Processor();
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String stringToDecorate = "Text to decorate";
        poemBeautifier.beautify(stringToDecorate, stringToDecorate1 -> stringToDecorate.toUpperCase() );
        poemBeautifier.beautify(stringToDecorate, stringToDecorate1 -> "ABC " + stringToDecorate + "ABC");
        poemBeautifier.beautify(stringToDecorate, stringToDecorate1 -> stringToDecorate.replace('e', 'z'));
        poemBeautifier.beautify(stringToDecorate, stringToDecorate1 -> stringToDecorate.substring(3,5));
/*
        PoemDecorator poemDecorator = stringToDecorate1 -> {
            char chars[] = stringToDecorate.toCharArray();
            String decoratedString ="";
            for(int i=chars.length-1; i>=0; i--){
                decoratedString += chars[i];
            }
            System.out.println("Before: " + stringToDecorate + "\nAfter: " + decoratedString);
            return decoratedString;
        };

        poemBeautifier.beautify(stringToDecorate, poemDecorator);
*/

        poemBeautifier.beautify(stringToDecorate, stringToDecorate1 -> {
            char chars[] = stringToDecorate.toCharArray();
            String decoratedString ="";
            for(int i=chars.length-1; i>=0; i--){
                decoratedString += chars[i];
            }
            return decoratedString;
        });

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}