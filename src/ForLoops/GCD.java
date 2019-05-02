package ForLoops;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter number 1:");
        int num1 = scn.nextInt();

        System.out.println("Please enter number 2:");
        int num2 = scn.nextInt();

        while (num1 != num2) {

            if (num1 > num2) {
                num1 -= num2;
            }
            else {
                num2 -= num1;
            }

        }

        System.out.println("GCD = " + num1);


//        int gcd = 1;
//
//        System.out.println("Please enter number 1:");
//        int num1 = scn.nextInt();
//
//        System.out.println("Please enter number 2:");
//        int num2 = scn.nextInt();
//
//        for (int i = 1; i <= num1 && i <= num2; i++) {
//
//            if (num1 % i == 0 && num2 % i == 0) {
//                gcd = i;
//            }
//
//            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
//
//        }


    }
}
