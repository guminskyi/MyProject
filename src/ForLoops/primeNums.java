package ForLoops;

import java.util.Scanner;

public class primeNums {
    public static void main(String[] args) {

          Scanner scn = new Scanner(System.in);

//        int num = 0;
//        String primeNumbers = "";
//
//        for (int i = 1; i <= 100; i++) {
//            int counter = 0;
//            for (num = i; num >= 1; num--) {
//                if (i % num == 0) {
//                    counter += 1;
//                }
//            }
//            if (counter == 2) {
//                primeNumbers += i + " ";
//            }
//        }
//        System.out.println("Prime numbers from 1 to 100 are: ");
//        System.out.println(primeNumbers);

        System.out.println("Please enter a number: ");

        int n = scn.nextInt();

        if (n <= 1) {
            System.out.println(n + " is not a prime number");
        }
        // Check from 2 to n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number");
            } else {
                System.out.println(n + " is a prime number");
            }
        }
    }
}
