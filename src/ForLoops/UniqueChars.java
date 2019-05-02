package ForLoops;

import java.util.Scanner;

public class UniqueChars {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String word = scn.nextLine();

        String unique = "";

        for (int idx = 0; idx < word.length(); idx++) {
//            System.out.println(word.substring(idx, idx + 1));

            if(!unique.contains(word.substring(idx, idx + 1))) {
                unique += word.substring(idx, idx + 1);
            }
        }
        System.out.println(unique);
    }
}
