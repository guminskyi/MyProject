package ForLoops;

import java.util.Scanner;

public class enterMonth {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int month;

        do {
            System.out.println("Please enter the number of the month:");
            month = scn.nextInt();
            if (month == 0 || month > 12) {
                System.out.println("Invalid input");
                break;
            }
        } while (month >= 1 && month <= 12);

    }
}
