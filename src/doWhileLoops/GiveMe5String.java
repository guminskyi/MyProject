package doWhileLoops;

import java.util.Scanner;

public class GiveMe5String {
    public static void main(String[] args) {

       Scanner scn = new Scanner(System.in);

       String codeWord = "flamingo";
       String input;
       int tries = 1;

       do {
           System.out.println("Enter the code word!");
           input = scn.nextLine();
           tries++;
       } while (!input.equals(codeWord) && tries < 4);

       if (input.equals(codeWord)) {
           System.out.println("You can go now.");
       }
       else {
           System.out.println("Game's over.");
       }

    }
}
