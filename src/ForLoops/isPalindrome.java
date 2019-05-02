package ForLoops;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {

        System.out.println("Please enter a word: ");

        Scanner scn = new Scanner(System.in);

        String word = scn.nextLine();
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }


//        for (int i = word.charAt(0); i < word.length(); i++) {
//            if (word.charAt(i) == word.charAt(word.length() - 1)) {
//                System.out.println("The word is a palindrome!");
//            }
//            else {
//                System.out.println("The word isn't a palindrome");
//            }
//        }

    }
}
