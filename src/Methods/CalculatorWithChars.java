package Methods;

import java.util.*;

public class CalculatorWithChars {

    public static void main(String[] args) {

        System.out.println("Please enter two double values:");

        Scanner scn = new Scanner(System.in);

        double num1 = scn.nextDouble();
        double num2 = scn.nextDouble();

        System.out.println("Please choose operator from the below options:");
        System.out.println("+,-,*,/");

        String operation = scn.next();

        switch(operation) {

            case "+":
                addition(num1,num2);
                break;

            case "-":
                substraction(num1,num2);
                break;

            case "*":
                multiplication(num1,num2);
                break;

            case "/":
                division(num1,num2);
                break;

            default:
                System.out.println("Invalid operation");

        }

    }


    public static void addition(double num1, double num2) {

        double result = num1 + num2;
        System.out.println(result);
        System.out.println("Result of " + num1 + " + " + num2 + " is " + result);

    }

    public static void substraction(double num1, double num2) {

        double result = num1 - num2;
        System.out.println(result);
        System.out.println("Result of " + num1 + " - " + num2 + " is " + result);

    }

    public static void multiplication(double num1, double num2) {

        double result = num1 * num2;
        System.out.println(result);
        System.out.println("Result of " + num1 + " * " + num2 + " is " + result);

    }

    public static void division(double num1, double num2) {

        if (num2 == 0) {

            System.out.println("ERROR: Can't divide by zero");

        } else {

            double result = num1 / num2;
            System.out.println(result);
            System.out.println("Result of " + num1 + " / " + num2 + " is " + result);

        }

    }

}
