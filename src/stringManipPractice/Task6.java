package stringManipPractice;

import java.util.Scanner;

// Given a string, if a length of the entered string is >= 2 and substring appears at both its beginning and end, return a string without the substring
// at the beginning, so "HelloHe" yields "lloHe." The substring may overlap with itself, so "Hi" yields "". Otherwise,
// return the original string unchanged.

// ex. HelloHe -> lloHe
// ex. Hi -> ""
// ex. HiHello -> HiHello

public class Task6 {
    public static void main(String[] args) {

        System.out.println("Please enter the string: ");

        Scanner scn = new Scanner(System.in);

        String word = scn.nextLine();
        String newWord = word.substring(2);
        int len = word.length();

        // if(len >= 2) {

            if (word.substring(0,2).equals(word.substring(len - 2))) {
                System.out.println(newWord);
            }
            else if (len <= 2) {
                System.out.println("");
            }
            else if (word.substring(0,1) != word.substring(len - 1, len)) {
                System.out.println(word);
            }

        }

    }

