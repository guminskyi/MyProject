package stringManipPractice;

import java.util.Scanner;

public class PhoneNumberValidator {
    public static void main(String[] args) {

        System.out.println("Please enter a phone number:");

        Scanner scn = new Scanner(System.in);

        String num = scn.next();

        if (num.startsWith("(")) {
            if (num.length() != 12) {
                System.out.println("Invalid length");
                return;
            }
        } else {
            if (num.length() != 10) {
                System.out.println("Invalid length");
                return;
            }
        }

            System.out.println("Length check passed");

        if (num.charAt(0) == '(') {
            if (num.charAt(4) != ')') {
                System.out.println("Invalid format");
                return;
            }
        } else {
            System.out.println("Parenthesis check passed");
        }

        num = num.replace("(","");
        num = num.replace(")","");
        num = num.replace("-","");

        for (int i = 0; i < num.length(); i++) {
            if (!(num.charAt(i) >= '0' && num.charAt(i) <= '9')) {
                System.out.println("Invalid character");
                return;
            }
        }

        System.out.println("Proper phone number!");

    }
}
