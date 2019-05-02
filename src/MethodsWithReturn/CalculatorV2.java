package MethodsWithReturn;

import java.util.Scanner;

public class CalculatorV2 {

    public static void main(String[] args) {

        double sum = CalculatorV2.add(3.0, 4.0);

        if(sum == 7.0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        System.out.println(CalculatorV2.add(3.0,4.0));

        System.out.println(CalculatorV2.calculate(44,22,'-'));

    }

    public static double calculate(double n1, double n2, char operator) {

        switch(operator) {

            case '+':
                return add(n1,n2);

            case '-':
                return substract(n1,n2);

            case '*':
                return multiply(n1,n2);

            case '/':
                return divide(n1,n2);

            default:
                throw new RuntimeException("ERROR: Invalid operator" + operator);
        }
    }

    public static double add(double num1, double num2) {

        double sum = num1 + num2;
        return sum;

    }

    public static double substract(double num1, double num2) {

        double difference = num1 - num2;
        return difference;

    }

    public static double multiply(double num1, double num2) {

        double product = num1 * num2;
        return product;

    }

    public static double divide(double num1, double num2) {

        if(num2 == 0) {
            System.out.println("ERROR: Cannot divide by zero");
            return -1;
        } else {
            double division = num1 / num2;
            return division;
        }

    }

}
