package MethodsWithReturn;

import java.util.*;

public class GetMax3 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();

        System.out.println("Maximum value of " + num1 + ", " + num2 + ", and " + num3 + " is: " +
                getMax3(num1,num2,num3));

    }

    public static int getMax3(int num1, int num2, int num3) {

        int lnum = 0;

        if (num1 == num2 && num1 == num3) {

            lnum = num1;

            System.out.println("All three integers are equal");

            return num1;

            } else {

            if (num1 >= num2 && num1 >= num3) {
                return num1;
            } else if (num2 >= num1 && num2 >= num3) {
                return num2;
            } else {
                return num3;
            }

        }

    }

}
