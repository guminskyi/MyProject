package MethodsWithReturn;

import java.util.*;

public class Anagram {

    public static void main(String[] args) {

        System.out.println(Anagram("silent", "listen"));

    }

    public static boolean Anagram(String s1, String s2) {

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        boolean equal = false;

        if(s1.length() != s2.length()) {
             return equal;
        }

        char[] charred1 = s1.toCharArray();
        char[] charred2 = s2.toCharArray();

        Arrays.sort(charred1);
        Arrays.sort(charred2);

        for(int i = 0; i < charred1.length; i++) {
            if (charred1[i] == charred2[i]) {
                equal = true;
            }
        }

//        if(s1.length() == s2.length()) {
//
//            for(int i = 0; i < s1.length(); i++) {
//                if(s2.contains(s1.substring(i,i+1))) {
//                    equal = true;
//                }
//            }
//
//        } else {
//            return equal;
//        }
//
        return equal;

    }

}
