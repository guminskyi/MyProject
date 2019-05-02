package ForLoops;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {

       Scanner scn = new Scanner(System.in);

        System.out.println("Please enter a number:");

        int n = scn.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }

        System.out.println("Please enter a number:");

        int lnum = 0;
        int sum = 0;

        for (int j = 1; j <= 3; j++) {
            int num = scn.nextInt();
            sum += num;

            if (lnum < num) {
                lnum = num;
            }

        }

        System.out.println("Largest number is: " + lnum);
        System.out.println("The sum of numbers is: " + sum);
    }
}
