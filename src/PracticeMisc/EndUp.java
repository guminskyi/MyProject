package PracticeMisc;

import java.util.Scanner;

public class EndUp {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter a word:");

        String word = scn.nextLine();

        for(int i = 0; i < word.length(); i++) {

            if (word.length() >= 3) {

                word = word.substring(0, word.length() - 3) +
                        word.substring(word.length() - 3).toUpperCase();

            } else {

                word.toUpperCase();

            }

        }

        System.out.println(word);

    }
}
