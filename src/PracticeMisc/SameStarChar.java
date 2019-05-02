package PracticeMisc;

import java.util.Scanner;

public class SameStarChar {
    public static void main(String[] args) {

        System.out.println("Please enter a string:");

        Scanner scn = new Scanner(System.in);

        String word = scn.nextLine();

        boolean starChars = false;

        char[] charred = word.toCharArray();

        for(int i = 0; i < charred.length; i++) {

            if (charred[i] == '*' && charred[i-1] == charred[i+1]) {
                starChars = true;
                break;

            }

        }



//        for(int j = 0; j < word.length(); j++) {
//
//            if(word.charAt(j) == '*' && word.charAt(j-1) == word.charAt(j+1)) {
//                starChars = true;
//                break;
//            }
//
//        }

        System.out.println(starChars);

    }
}
