package PracticeMisc;

import java.util.Scanner;

public class Str2 {
    public static void main(String[] args) {

        System.out.println("Please enter a string:");

        Scanner scn = new Scanner(System.in);

        String word = scn.nextLine();

        if (word.length() < 3 || word.length() > 100) {

            System.out.println("Invalid enter");

        } else {

            for (int i = 0; i < word.length(); i++) {

                if (Character.isDigit(word.charAt(i))) {
                    System.out.print(word.charAt(i));
                }

            }

        }

    }
}
