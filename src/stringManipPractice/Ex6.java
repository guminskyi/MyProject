package stringManipPractice;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {




//    Ask user to enter a word. If the word has odd number of characters and has 5 or more characters,
//    print the middle three characters of the word.
//
//    Input:
//    fifteen
//
//    Output:
//    fte

        System.out.println("Please enter word:");
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.nextLine();

        // Your code here
        //------------------------------------------------

        char one = n1.charAt(n1.length() / 2 - 1);
        char two = n1.charAt(n1.length() / 2);
        char three = n1.charAt(n1.length() / 2 + 1);
        String oneS = Character.toString(one);
        String twoS = Character.toString(two);
        String threeS = Character.toString(three);
        String unoDosTres = oneS.concat(twoS).concat(threeS);


        if (n1.length() % 2 == 1 && n1.length() >= 5) {
            System.out.println(unoDosTres);
        }








    }
}
