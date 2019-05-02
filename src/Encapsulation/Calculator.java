package Encapsulation;

public class Calculator {

    public String operation;

    public static double add(double num1, double num2) {
        // operation = "add"; => doesn't work
        return num1 + num2;
    }

    public static double substract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        operation = "multiply";
        return num1 * num2;
    }

    public static void multiply2(double num1, double num2) {
       // return multiply2(num1, num2); => won't work since we're trying to use non-static method with static vars
    }

}
