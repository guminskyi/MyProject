package PracticeMisc;

import java.util.Scanner;

public class DivisibleBy2And3 {
    public static void main(String[] args) {

        System.out.println("Please enter a number:");

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int iSq;

        for (int i = 1; i <= num; i++) {

            if (i % 2 == 0 && i % 3 == 0) {
                iSq = i * i;
                System.out.print(iSq + " ");
            }

        }

    }
}
