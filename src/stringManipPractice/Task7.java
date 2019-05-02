package stringManipPractice;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        System.out.println("Please enter the string: ");

        Scanner scn = new Scanner(System.in);

        String word = scn.nextLine();
        int len = word.length();

        if (len >= 2) {
            System.out.println(word.substring(0,2));
        }
        else if (len == 1) {
            System.out.println(word.charAt(0) + "@");
        }
        else {
            System.out.println("@@");
        }

    }
}
