package PracticeMisc;

import java.util.Scanner;

public class CountYZ {
    public static void main(String[] args) {

        System.out.println("Please enter a sentence:");

        Scanner scn = new Scanner(System.in);

        String sentence = scn.nextLine().toLowerCase();
        int count = 0;
//
//        String[] splittedWords = sentence.split(" ");
//
//        for (String each : splittedWords) {
//
//            if (each.endsWith("y") || each.endsWith("z")) {
//                count++;
//            }
//
//        }
//


        for (int i = 0; i < sentence.length() - 1; i++) {

            if (sentence.charAt(i) == 'y' && sentence.substring(i+1, i+2).equals(" ")) {
                count++;
            }

            if (sentence.charAt(i) == 'z' && sentence.substring(i+1, i+2).equals(" ")) {
                count++;
            }

        }

        if(sentence.charAt(sentence.length() - 1) == 'y' ||
                sentence.charAt(sentence.length() - 1) == 'z') {
            count++;
        }

        System.out.println(count);

    }
}
