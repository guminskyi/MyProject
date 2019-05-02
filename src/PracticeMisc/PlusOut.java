package PracticeMisc;

import java.util.Scanner;

public class PlusOut {
    public static void main(String[] args) {

        System.out.println("Please enter a word:");

        Scanner scn = new Scanner(System.in);

        String word = scn.nextLine();

        for (int i = 0; i < word.length(); i++) {

            boolean checkDig = Character.isDigit(word.charAt(i));
            boolean checkLet = Character.isLetter(word.charAt(i));
            // boolean contXY = word.contains("xy");

            if(word.charAt(i) == 'x' && word.charAt(i+1) == 'y') {
               continue;
            }

            if(word.charAt(i) == 'y' && word.charAt(i-1) == 'x') {
               continue;
            }

            if(checkDig || checkLet) {
               word = word.replace(word.charAt(i), '+');
            }

        }

        System.out.println(word);

    }
}
