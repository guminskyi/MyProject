package ForLoops;

import java.util.Scanner;

public class DoYouWantToContinue {
    public static void main(String[] args) {

     Scanner scn = new Scanner(System.in);

     int countPos = 0;
     int countNeg = 0;
     int countZero = 0;
     String choice = "";
     String yes = "y";
     String no = "n";

     do {

         System.out.println("Enter the number:");
         int input = scn.nextInt();

         if (input > 0) {
             countPos += 1;
         }
         else if (input < 0) {
             countNeg += 1;
         }
         else {
             countZero += 1;
         }

         System.out.println("Do you want to continue y/n?");
         choice = scn.next();

     } while (choice.equals(yes));

         if (choice.equals(no)) {
             System.out.println("Positive numbers: " + countPos);
             System.out.println("Negative numbers: " + countNeg);
             System.out.println("Zero numbers: " + countZero);
         }

    }
}
