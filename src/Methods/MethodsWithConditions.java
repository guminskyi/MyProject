package Methods;

import java.util.Scanner;
import java.util.Arrays;

public class MethodsWithConditions {
    public static void main(String[] args) {

        // create a method getLarger that accepts 2 nums and prints larger one
        // if they're equal -> print "Numbers are equal: number"

        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter number 1:");
        int num1 = scn.nextInt();

        System.out.println("Please enter number 2:");
        int num2 = scn.nextInt();

        getLarger(num1, num2);

        // int[] arr = {100,30,40};
        // getMax(arr);
        getMax(new int[] {100,30,40} );

        System.out.println("Please enter a number:");
        int number = scn.nextInt();
        steps(number);

    }

    public static void getLarger(int num1, int num2) {

        if(num1 > num2) {
            System.out.println(num1);
        } else if (num1 < num2) {
            System.out.println(num2);
        } else {
            System.out.println("Numbers are equal: " + num1);
        }

        System.out.println();

    }

    // create a method getMax that accepts an int array and prints largest num in the array
    // if array is empty, print "ERROR: Array is empty"

    public static void getMax(int[] arr) {

           if(arr.length == 0) {
                System.out.println("ERROR: Array is empty");
                return;
           }

           Arrays.sort(arr);

        System.out.println("Largest number in the array: " + arr[arr.length - 1]);

        System.out.println();

    }

    // create a method steps, it accepts an int param
    // if the param is negative, print "jump" that many times
    // - 2 -> "Jump 1" "Jump 2"
    // if param is 0 then we sit
    // if it's positive we take steps:
    // Step 1
    // Step 2

    public static void steps(int number) {

        if(number < 0) {

            for(int j = 1; j <= number * (-1); j++) {
                System.out.println("Jump " + j);
            }

        }

        else if(number == 0) {
            System.out.println("Sit");
        }

        else {

            for(int i = 1; i <= number; i++) {
                System.out.println("Step " + i);
            }

        }


    }

}
