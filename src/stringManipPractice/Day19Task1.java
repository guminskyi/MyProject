package stringManipPractice;

import java.util.Scanner;

public class Day19Task1 {
    public static void main(String[] args) {

        System.out.println("Please enter a string: ");

        Scanner scn = new Scanner(System.in);

        String word = scn.nextLine();
        String firstChar = word.substring(0,1).toUpperCase();

        System.out.println(firstChar + word.substring(1));

    }

}
