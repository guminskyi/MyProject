package stringManipPractice;

import java.util.Scanner;

public class englishLetters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two words(separate with space):");
//        String str3 = input.nextLine();

//        Task 3
//        Given two strings of lowercase English letters, word1  and word2, perform the following operations:
//
//        Sum the lengths of word1 and word2 and print
//        Capitalize the first letter in word1 and word2 and print them on a single line, separated by a space.
//
//                Sample Input:
//        hello world
//
//        Sample Output:
//        10
//        Hello World

//        Sample Input:
//        java cool
//
//        Sample Output:
//        8
//        Java Cool

        String word1 = input.next().toLowerCase();
        String word2 = input.next().toLowerCase();
        int sum = word1.length() + word2.length();

        System.out.println(sum);
        System.out.println(word1.substring(0,1).toUpperCase() + word1.substring(1) + " " +
                word2.substring(0,1).toUpperCase() + word2.substring(1));

    }
}
