package Methods;

import java.util.Scanner;

public class Plus {
    public static void main(String[] args) {

        plus();

    }

    public static void plus() {

        System.out.println("Enter first number:");

        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextInt();

        System.out.println("Enter second number:");

        int num2 = scn.nextInt();

        int result = num1 + num2;

        System.out.println(result);

    }

}
