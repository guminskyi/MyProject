package ForLoops;

import java.util.Scanner;

public class HowOftenChar {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String word = scn.nextLine();

        System.out.println("Please enter a character: ");
        String character = scn.nextLine();

        int howMany = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.substring(i, i + 1).equals(character)) {
                howMany++;
            }

        }

        System.out.println(howMany);

    }
}
