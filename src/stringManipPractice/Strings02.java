package stringManipPractice;

import java.util.Scanner;

public class Strings02 {
    public static void main(String[] args) {

        System.out.println("Please enter the string name: ");

        Scanner scn = new Scanner(System.in);

        String someString = scn.next();

        if (someString.length() < 4) {
            System.out.println("String too short");
        }
        else {
                if (someString.charAt(0) == someString.charAt(someString.length() - 1) && someString.charAt(1) == someString.charAt(someString.length() - 2)) {
                    System.out.println("Both firsts and seconds same");
                } else if (someString.charAt(0) == someString.charAt(someString.length() - 1)) {
                    System.out.println("Firsts same");
                } else if (someString.charAt(1) == someString.charAt(someString.length() - 2)) {
                    System.out.println("Seconds same");
                }
        }
    }
}
