package MethodsWithReturn;

import java.util.Random;

public class GuessTheNumber {

    public static void main(String[] args) {

        playGuessNumComputerOnly();
        playGuessNumWithLimit();

    }

    // playGuessNumComputerOnly method
    // playGuessNumWithLimit(int limit) method
    // playGuessNumComputerVSMe(int secretNum) method

    public static void playGuessNumComputerOnly() {

        Random random = new Random();
        int secretNumber = random.nextInt(21);
        int counter = 0;

        do {

            System.out.println("Guess the secret number:");
            int guessNumber = random.nextInt(21);
            System.out.println("Guessing: " + guessNumber);

            // check if secretNum matches guessNumber

            if(guessNumber == secretNumber) {
                System.out.println("They match!");
                break;
            } else {
                System.out.println("Wrong! Try again");
            }
            counter++;

        } while(true);

        System.out.println();

        System.out.println("Number of attempts: " + counter);

        System.out.println();

    }

    public static void playGuessNumWithLimit() {

        Random random = new Random();
        int secretNumber = random.nextInt(21);
        int counter = 0;
        int tries = 0;

       while (tries <= 5) {

            System.out.println("Guess the secret number:");
            int guessNumber = random.nextInt(21);
            System.out.println("Guessing: " + guessNumber);

            // check if secretNum matches guessNumber

            if(guessNumber == secretNumber) {
                System.out.println("They match!");
                break;
            } else {
                System.out.println("Wrong! Try again");
            }
            counter++;
            tries++;

            if (tries == 5) {
                System.out.println("You lost! Game over!");
                break;
            }

        }

        System.out.println();

        System.out.println("Number of attempts: " + counter);

    }

}
