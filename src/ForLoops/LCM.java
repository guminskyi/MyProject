package ForLoops;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int lcm;

        System.out.println("Please enter number 1:");
        int num1 = scn.nextInt();

        System.out.println("Please enter number 2:");
        int num2 = scn.nextInt();

        lcm = (num1 > num2) ? num1 : num2;

        while (true) {

            if (lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.println("LCM is: " + lcm);
                break;
            }

        lcm++;

        }

    }
}
