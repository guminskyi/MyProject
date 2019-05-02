package stringManipPractice;

import java.util.Scanner;

public class CatDog {
    public static void main(String[] args) {

        System.out.println("Please enter a word:");

        Scanner scn = new Scanner(System.in);

        String word = scn.next();

        int catCount = 0; int dogCount = 0;
        boolean equal = false;

        for (int i = 0; i < word.length() - 2; i++) {

            if (word.charAt(i) == 'c' && word.charAt(i+1) == 'a' && word.charAt(i+2) == 't') {
                catCount++;
            }

            if (word.charAt(i) == 'd' && word.charAt(i+1) == 'o' && word.charAt(i+2) == 'g') {
                dogCount++;
            }

        }

        if (catCount == dogCount) {
            equal = true;
        }

        System.out.println(equal);

    }
}
