package Methods;

import java.util.*; // import all classes from java.util.package

public class Calculator {
    public static void main(String[] args) {

       Scanner scn = new Scanner(System.in);

        System.out.println();

        System.out.println("Enter two numbers: \n");

        double n1 = scn.nextDouble();
        double n2 = scn.nextDouble();

        System.out.println();

        System.out.println("Choose operation: \n" +
                "1 - add \n" +
                "2 - substract \n" +
                "3 - multiply \n" +
                "4 - divide \n"
        );

        int operation = scn.nextInt();

        System.out.println();

        switch(operation) {
            case 1:
                add(n1, n2);
                break;
            case 2:
                substract(n1, n2);
                break;
            case 3:
                multiply(n1, n2);
                break;
            case 4:
                divide(n1, n2);
                break;
            default:
                System.out.println("ERROR: Invalid operation");
        }

    }

    // add following methods:
    // 1. add -> 2 double args(params, inputs)
    // adds nums and prints the results

    // 2. substract -> 2 double args
    // substracts nums (n1 - n2) and prints the results

    // 3. multiply -> 2 double args
    // multiplies and prints

    // 4. divide -> ...

    public static void add(double num1, double num2) {

        double sum = num1 + num2;
        System.out.println(sum);

    }

    public static void substract(double num1, double num2) {

        double difference = num1 - num2;
        System.out.println(difference);

    }

    public static void multiply(double num1, double num2) {

        double product = num1 * num2;
        System.out.println(product);

    }

    public static void divide(double num1, double num2) {

        if(num2 == 0) {
            System.out.println("ERROR: Cannot divide by zero");
        } else {
            double division = num1 / num2;
            System.out.println(division);
        }

    }

}
