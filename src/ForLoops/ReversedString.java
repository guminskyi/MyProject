package ForLoops;

import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {

        System.out.println("Please enter a word: ");

        Scanner scn = new Scanner(System.in);

        // using for loop -> loop from length of word -1 to 0
        // use either charAt or substring and add that char to reversed string

        String word = scn.nextLine();
        // String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.println(word.charAt(i)); // word.substring(i, i + 1)
            // reversed += word.charAt(i);
        }
//      System.out.println(reversed);

    }

}
