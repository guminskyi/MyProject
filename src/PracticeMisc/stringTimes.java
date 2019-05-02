package PracticeMisc;

import java.util.Scanner;

public class stringTimes {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter a word:");

        String word = scn.nextLine();

        System.out.println("Please enter a number:");

        int num = scn.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print(word);
        }

    }
}
