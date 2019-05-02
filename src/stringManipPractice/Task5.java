package stringManipPractice;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        System.out.println("Please enter a string: ");

        Scanner scn = new Scanner(System.in);

        String word = scn.nextLine();

        if (word.length() >= 3) {
            word = word.substring(0,2);
        }

        System.out.println(word+word+word);

    }
}
