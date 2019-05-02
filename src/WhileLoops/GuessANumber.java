package WhileLoops;

import java.util.Scanner;
import java.util.Random;

public class GuessANumber {
    public static void main(String[] args) {

        // random is a class name
        // purpose -> will generate random numbers

        Scanner scn = new Scanner(System.in);
        Random random = new Random();

//        System.out.println(random.nextInt(10)); // give me a random num between 0-9
//        System.out.println(random.nextDouble());

        int secretNum = random.nextInt(10);
        int guessNum;
        int iTries = 0;

        do {

            System.out.println("Guess the number: ");
            guessNum = scn.nextInt();
            iTries++;

            if (secretNum == guessNum) {
                System.out.println("Congrats!");
            }
            else if (guessNum < secretNum) {
                System.out.println("Too small");
            }
            else {
                System.out.println("Too large");
            }

            if (iTries == 5) {
                System.out.println("You lost!");
                System.out.println("Secret number was: " + secretNum);
                break;
            }

        } while (secretNum != guessNum && iTries <= 3);



    }
}
