package ForLoops;

import java.util.Scanner;

public class TenMulitples {
    public static void main(String[] args) {

        System.out.println("Please enter a number: ");

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " * " + i + " = " + result);
        }


    }
}
