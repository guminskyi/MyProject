package MethodsWithReturn;

public class IsPalindromeHard {

    public static void main(String[] args) {

        System.out.println(IsPalindrome("civic"));


    }

    public static boolean IsPalindrome(String str) {

        str = str.toLowerCase();

        boolean equal = false;

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) != str.charAt(str.length() - (i+1))) {
                equal = false;
                break;
            }

            equal = true;

        }

        return equal;

    }

}
