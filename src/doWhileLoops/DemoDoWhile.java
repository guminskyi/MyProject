package doWhileLoops;

import java.util.Scanner;

public class DemoDoWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Angle in radians: ");

        double angle = input.nextDouble();

        System.out.println();

        int choice;
        do {
            menuPrompt();
            choice = input.nextInt();
            switch(choice) {
                case 1:
                    System.out.printf("sin: %.1f%n", Math.sin(angle));
                    break;
                case 2:
                    System.out.printf("cos: %.1f%n", Math.cos(angle));
                    break;
                case 3:
                    System.out.printf("tan: %.1f%n", Math.tan(angle));
                    break;
                case 0:
                    System.out.println("goodbye");
                    break;
                default:
                    System.out.println("Invalid selection");
            }
            System.out.println();
        } while (choice != 0);

    }
    private static void menuPrompt() {

        System.out.println("1 .. sin");
        System.out.println("2 .. cos");
        System.out.println("3 .. tan");
        System.out.println("0 .. exit");
        System.out.println("Your choice: ");
    }
}
