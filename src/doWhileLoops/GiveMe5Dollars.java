package doWhileLoops;

import java.util.Scanner;

public class GiveMe5Dollars {
    public static void main(String[] args) {

        // ask for $5
        // and keep asking until you get it
        // or user enters it
        // max 3 attempts

        Scanner scn = new Scanner(System.in);

       int amount;
       int tries = 1; // max 3 attempts

        do {
            System.out.println("Give me 5 dollars!");
            amount = scn.nextInt();
            tries++;
        } while (amount < 5 && tries < 4);

//        System.out.println("Give me 5 dollars!");

//        amount = scn.nextInt();
//
//        while (amount < 5 && tries <= 2) {
//            System.out.println("Give me 5 dollars!");
//            tries++;
//            amount = scn.nextInt();
//        }
//
        if (amount >= 5) {
            System.out.println("Thanks!");
        } else {
            System.out.println("You failed!");
        }


    }
}
