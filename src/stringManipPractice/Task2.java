package stringManipPractice;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("Please enter two strings: ");

        Scanner scn = new Scanner(System.in);

        String n1 = scn.nextLine();
        String n2 = scn.nextLine();

        if (n1.length() > n2.length()) {
            System.out.println(n2+n1+n2);
        }
        else {
            if (n1.length() < n2.length()) {
                System.out.println(n1+n2+n1);
            }
//            else if (n1.length() == n2.length()) {
//                System.out.println(n1+n2);
//            }
            else if (n1.isEmpty()) {
                System.out.println(n2);
            }
            else if(n2.isEmpty()) {
                System.out.println(n1);
            }
        }




    }
}
