package stringManipPractice;

import java.util.Scanner;

public class appleBanana {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter word:");
        String str2 = input.nextLine();

//        Task 2
//        Given a String, str , perform the following conditional actions:
//
//        Check if str has 3 or more character, if less than 3 or bigger than 100 character, print only Invalid enter

//        Convert str to all lower characters

//        If number of character is odd convert middle character Upper case

//                If number of character is even convert middle two character Upper case (ex: name -> nAMe)
//
//
//        Sample Input:
//        apple
//        Sample Output:
//        apPle
//
//        Sample Input:
//        BANANA
//        Sample Output:
//        baNAna
//
//        Sample Input:
//        xy
//        Sample Output:
//        Invalid enter
//
        //your code here
        //----------------------------------------------------------

        if (str2.length() < 3 || str2.length() > 100) {
            System.out.println("Invalid enter");
        }

        str2 = str2.toLowerCase();
        int len = str2.length() / 2;

        String upperCasedOdd = str2.substring(len, len + 1).toUpperCase();
        String UCOstart = str2.substring(0, len);
        String UCOend = str2.substring(len + 1);
        String upperCasedEven = str2.substring(len - 1, len + 1).toUpperCase();
        String LCEstart = str2.substring(0, len - 1);
        String LCEend = str2.substring(len + 1);

        if (str2.length() % 2 == 1) {
            System.out.println(UCOstart+upperCasedOdd+UCOend);
        }
        else {
            System.out.println(LCEstart+upperCasedEven+LCEend);
        }
    }
}
