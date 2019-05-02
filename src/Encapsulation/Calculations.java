package Encapsulation;

public class Calculations {
    public static void main(String[] args) {

        System.out.println(Calculator.add(12.1, 14.2));
        System.out.println(Calculator.substract(45.1, 5.1));

        Calculator mult = new Calculator();
        System.out.println(mult.multiply(45.1, 57.8));
        System.out.println(mult.add(12,2));

        // Calculator.operation = "add"; => won't work
        mult.operation = "math calculations";

    }
}
