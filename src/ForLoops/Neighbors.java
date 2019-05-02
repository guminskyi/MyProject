package ForLoops;

import java.util.Scanner;

public class Neighbors {
    public static void main(String[] args) {

        // string; you need to check for the same char side by side
        // if found, say "beep - " + char
        // ex. aavvaaww
        // aa Beep - a

        System.out.println("Please enter a word:");

        Scanner scn = new Scanner(System.in);
        String word = scn.nextLine();

        for (int i = 0; i < word.length() - 1; i++) {

            if(word.charAt(i) == word.charAt(i + 1)) {
                System.out.println("Beep + " + word.charAt(i));
            }

//            if(word.substring(i, i + 1).equals(word.substring(i + 1, i + 2))) {
//                System.out.println("Beep + " + word.charAt(i));
//            }

        }

    }
}
