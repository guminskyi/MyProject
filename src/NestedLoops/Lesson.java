package NestedLoops;

import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


//        for (int j = 1; j <= 5; j++) {
//            for (int i = 1; i <= j; i++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

//        for (int i = 1; i < 10; i += 2) {
//            for (int k = 0; k < (4 - i / 2); k++) {
//                System.out.print(" ");
//            }
//                for (int j = 0; j < i; j++) {
//                    System.out.print("*");
//                }
//            System.out.println();
//        }

//        for (int i = 0; i < 5; i++)
//            System.out.println("    *********".substring(i, 5 + 2 * i));


//        for (int k = 5; k >= 1; k--) {
//            for (int l = 1; l <= k; l++) {
//                System.out.print(l + " ");
//            }
//            System.out.println();
//        }

        for (int i = 6, k = 0; i > 0 && k < 6; i--, k++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
