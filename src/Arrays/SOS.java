package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class SOS {
    public static void main(String[] args) {

        System.out.println("Please enter a word:");

        Scanner scn = new Scanner(System.in);

        String word = scn.next().toLowerCase();

        int len = word.length() - 2;

        boolean sos = false;

//        for (int i = 0; i <= len; i++) {
//            if (word.charAt(i) == 's' && word.charAt(i + 2) == 's') {
//                sos = true;
//            }
//        }
//
//

         char[] splittedWord = word.toCharArray();

         for (int n = 0; n <= len; n++) {
             if(splittedWord[n] == 's' && splittedWord[n+2] == 's') {
                sos = true;
                break;
             }
         }

        System.out.println(sos);

        if(sos == false) {
            System.out.println("No s-char-s in your word");
        }

    }
}