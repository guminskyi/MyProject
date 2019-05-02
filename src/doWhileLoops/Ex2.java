package doWhileLoops;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        System.out.println("Please enter a word: ");

        Scanner scn = new Scanner(System.in);

        String word = scn.nextLine();
        int count = 0;

//        while (count < word.length()) {
//            System.out.println(word.charAt(count));
//            count++;
//        }

        do {
            System.out.println(word.substring(count, count + 1));
            count++;
        } while (count < word.length());

        System.out.println("All letters printed");
    }
}
