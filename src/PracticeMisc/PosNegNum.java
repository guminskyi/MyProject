package PracticeMisc;
import java.util.Scanner;
public class PosNegNum {

    public static void main(String[] args) {
        // Write a Java program to get a number from the user and print whether it is positive or negative. Go to the editor
        //
        //Test Data
        //Input number: 35
        //Expected Output :
        //Number is positive
        System.out.println("Please enter a number: ");

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        if(num > 0) {
            System.out.println("Positive number");
        }
        else if(num < 0) {
            System.out.println("Negative number");
        }

    }
}

