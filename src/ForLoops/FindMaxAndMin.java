package ForLoops;

import java.util.Scanner;

public class FindMaxAndMin {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number:");

        int num = scn.nextInt();
        String answer = "y";
        int biggest = num;
        int smallest = num;

        System.out.println("Do you want to continue: y/n?");
        answer = scn.next();

        while (answer.equals("y")) {

            System.out.println("Enter a number");
            num = scn.nextInt();

            System.out.println("Do you want to continue: y/n?");
            answer = scn.next();

            if (num >= biggest) {
                biggest = num;
            }
            if (num <= smallest) {
                smallest = num;
            }
        }

                System.out.println("Largest number: " + biggest);
                System.out.println("Smallest number: " + smallest);

    }
}
