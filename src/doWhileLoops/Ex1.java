package doWhileLoops;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

     System.out.println("Please enter a number: ");

     Scanner scn = new Scanner(System.in);

     int start = scn.nextInt();
     int end = scn.nextInt();

     if (start < end) {

//         do {
//             System.out.println("Step " + start);
//             start++;
//         } while (start <= end);


         while (start <= end) {
             System.out.println("Step " + start);
             start++;
         }
         System.out.println("All steps forward counted");

     }

     else if (start > end) {

//         do {
//             System.out.println("Step " + start);
//             start--;
//         } while (start >= end);


        while (start >= end) {
            System.out.println("Step " + start);
            start--;
        }
        System.out.println("All steps backward counted");

     }
   }
}