package Arrays;

import java.util.Scanner;

public class SplitEmail {
    public static void main(String[] args) {

        System.out.println("Please enter an email:");

        Scanner scn = new Scanner(System.in);

        // given a string var email, write code using split
        // to print email id and domain in separate lines
        // ex. email -> info@cybertekschool.com
        // print:
        // email id: info
        // email domain: cybertekschool.com

        String email = scn.nextLine();

        String[] splitted = email.split("@");

        System.out.println(splitted.length);

        if(splitted.length == 2) {
            System.out.println("Email id: " + splitted[0]);
            System.out.println("Email domain: " + splitted[splitted.length - 1]);
        } else {
            System.out.println("Invalid email");
        }



    }
}
