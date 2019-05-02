package Methods;

import java.util.Scanner;

public class Four {
    public static int main(String[] args) {

//        4. Write a Java method to count all vowels in a string. Go to the editor
//        Test Data:
//        Input the string: w3resource
//        Expected Output:
//
//        Number of  Vowels in the string: 4

        System.out.println("Input the string: ");

        Scanner scn = new Scanner(System.in);

        String word = scn.nextLine();

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' ||
                word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'A' ||
                word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U') {
                count++;
            }
        }
        return count;

    }

}
