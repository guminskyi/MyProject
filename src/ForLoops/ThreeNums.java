package ForLoops;

import java.util.Scanner;

public class ThreeNums {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

//        System.out.println("Enter num1:");
//        int num1 = scn.nextInt();
//
//        System.out.println("Enter num2:");
//        int num2 = scn.nextInt();
//
//        System.out.println("Enter num3:");
//        int num3 = scn.nextInt();
//
//        if (num1 > num2 && num1 > num3) {
//            System.out.println("Largest Number: " + num1);
//        }
//        else if (num2 > num1 && num2 > num3) {
//            System.out.println("Largest Number: " + num2);
//        }
//        else if (num3 > num1 && num3 > num2) {
//            System.out.println("Largest Number: " + num3);
//        }
//
//        int sum = num1 + num2 + num3;
//        System.out.println("Sum: " + sum);

        System.out.println("Please enter a number:");

        int sum = 0;
        int gnum = 0;

        for (int i = 1; i <= 3; i++) {
            int a = scn.nextInt();
            sum += a;

            if (gnum < a) {
                gnum = a;
            }

            System.out.println("Sum: " + sum);
            System.out.println("Greatest number: " + gnum);

        }

    }
}
