package PracticeMisc;

import java.util.Scanner;

public class In1020 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        boolean in1020 = false;

        System.out.println("Please enter num1:");
        int num1 = scn.nextInt();

        System.out.println("Please enter num2:");
        int num2 = scn.nextInt();

        if(num1 >= 10 && num1 <= 20 && num2 >= 10 && num2 <= 20) {
            in1020 = true;
        }

        System.out.println(in1020);

    }
}
