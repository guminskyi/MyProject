package MethodsWithReturn;

import java.util.*;

public class StringMethods {

    public static void main(String[]args){

        String word = "civIc";
        System.out.println(reverse(word));

        boolean isPal = isPalindrome(word);
        System.out.println(isPal);

    }

    // method reverse
    // params 1
    // returns string
    // reverses the param string and returns the result

    public static String reverse(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
            // reversed += word.substring(i,i+1);
        }

        return reversed;

    }

    // method isPalindrome
    // 1 string
    // return boolean
    // true if palindrome, false if not

    public static boolean isPalindrome(String word) {

//        String reversed = "";
//
//        for(int i = word.length() - 1; i >= 0; i--) {
//            reversed += word.substring(i,i+1);
//        }
//
//        if(word.equalsIgnoreCase(reversed)) {
//            return true;
//        } else {
//            return false;
//        }

        // OR

         return reverse(word).equalsIgnoreCase(word);

    }

}
