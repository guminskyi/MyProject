package WhileLoops;

import java.util.Scanner;

public class Apples {
    public static void main(String[] args) {

        System.out.println("Please enter a number: ");

        Scanner scn = new Scanner(System.in);

        int number = scn.nextInt();

        int count = 1;

        while (count <= number) {
            System.out.println(count + " bites");
            count++;
        }
        System.out.println("done with the apple");

    }

}
