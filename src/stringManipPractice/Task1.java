package stringManipPractice;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Please enter a string: ");

        Scanner scn = new Scanner(System.in);

        String n1 = scn.nextLine();

        String n2 = n1.substring(1, n1.length() - 1);

        System.out.println(n2);
    }
 }
