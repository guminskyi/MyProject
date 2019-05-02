package doWhileLoops;

import java.util.Scanner;

public class RepeatUntilDont {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

//        System.out.println("Give me my money!");

        int amount; //= scn.nextInt();
        int tries = 1;

//        while (amount < 5 && tries < 3) {
//        System.out.println("Give me my money!");
//        tries++;
//        amount = scn.nextInt();
//        }

        do {
            System.out.println("Give me my money!");
            amount = scn.nextInt();
            tries++;
        } while (amount < 5 && tries < 4);

        if (amount >= 5) {
            System.out.println("Finally!");
        }
        else {
            System.out.println("You failed!");
        }
    }
}
