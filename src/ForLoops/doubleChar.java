package ForLoops;

import java.util.Scanner;

public class doubleChar {
    public static void main(String[] args) {

        System.out.println("Please enter a word: ");

        Scanner scn = new Scanner(System.in);

        String word = scn.nextLine();
        String doubleCharred = "";

        for (int i = 0; i < word.length(); i++) {
            doubleCharred += word.substring(i, i + 1) + word.substring(i, i + 1);
        }
        System.out.println(doubleCharred);
    }
}
