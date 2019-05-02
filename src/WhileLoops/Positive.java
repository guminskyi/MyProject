package WhileLoops;

import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {

        System.out.println("Please enter a positive integer: ");

        Scanner scn = new Scanner(System.in);

        int total = 0;

        int num = scn.nextInt();

        while (num > 0) {
            total += num;
            num = scn.nextInt();
        }

        System.out.println("Sum of all numbers: " + total);
    }


}
