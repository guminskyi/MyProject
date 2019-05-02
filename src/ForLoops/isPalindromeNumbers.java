package ForLoops;

import java.util.Scanner;

public class isPalindromeNumbers {
    public static void main(String[] args) {

        System.out.println("Please enter a number: ");

        Scanner scn = new Scanner(System.in);

        int number = scn.nextInt();

        String strNumber = Integer.toString(number);
        String revNumber = "";

        for (int i = strNumber.length() - 1; i >= 0; i--) {
            revNumber += strNumber.charAt(i);
        }

        if (strNumber.equals(revNumber)) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }

    }
}
