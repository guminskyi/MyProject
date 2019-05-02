package ForLoops;

import java.util.Scanner;

public class catdog {
    public static void main(String[] args) {

        System.out.println("Please enter a word:");

        Scanner scn = new Scanner(System.in);

        String word = scn.nextLine();

        String cat = "cat";
        String dog = "dog";
        int catAmount = 0;
        int dogAmount = 0;

        for (int i = 0; i < word.length(); i++) {

            if (word.contains(cat)) {
                catAmount += 1;
            }

            if (word.contains(dog)) {
                dogAmount += 1;
            }

        }

        if (catAmount != dogAmount) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
