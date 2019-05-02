package WhileLoops;

import java.util.Scanner;

public class xValue {
    public static void main(String[] args) {

        System.out.println("Please enter a number: ");

        Scanner scn = new Scanner(System.in);

        double xValue = scn.nextDouble();

        while (xValue <= 10) {
            System.out.println("The value of xValue is: " + xValue);
            xValue += 0.5;
        }

        System.out.println("xValue has reached 10.0");

    }
}
