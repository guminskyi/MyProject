package PracticeMisc;
import java.util.Scanner;
public class NumToWord {
    public static void main(String[] args) {

//        Write a Java program that keeps a number from the user
//        and generates an integer between 1 and 7 and displays the name of the weekday. Go to the editor
//
//        Test Data
//        Input number: 3
//        Expected Output :
//        Wednesday

        System.out.println("Please enter a number: ");

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        String dayString;

        switch (num) {
            case 1:
                dayString = "Sunday";
                break;
            case 2:
                dayString = "Monday";
                break;
            case 3:
                dayString = "Tuesday";
                break;
            case 4:
                dayString = "Wednesday";
                break;
            case 5:
                dayString = "Thursday";
                break;
            case 6:
                dayString = "Friday";
                break;
            case 7:
                dayString = "Saturday";
                break;
            default:
                dayString = "Invalid input";
        }
        System.out.println(dayString);
    }
}
