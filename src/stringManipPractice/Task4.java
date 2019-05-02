package stringManipPractice;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        System.out.println("Please enter a string: ");

        Scanner scn = new Scanner(System.in);

        String word = scn.nextLine();
        String word1 = word.substring(0, word.length() - 2);
        String word2 = word.substring(word.length() - 2, word.length() - 1);
        String word3 = word.substring(word.length() - 1);

        if (word.length() >= 3) {

            System.out.println(word1+word3+word2);

        }

        else if (word.length() == 2) {

            System.out.println(word3+word2);

        }

        else {
            System.out.println("Word too short");
        }

    }
}
