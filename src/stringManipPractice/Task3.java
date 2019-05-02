package stringManipPractice;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Please enter two strings: ");

        Scanner scn = new Scanner(System.in);

        String n1 = scn.nextLine();
        String n2 = scn.nextLine();
        String n1omitted = n1.substring(1);
        String n2omitted = n2.substring(1);

        if (n1.length() >= 1 && n2.length() >= 1) {
            System.out.println(n1omitted + n2omitted);
        }
    }
}
