package MethodsWithReturn;

public class BiggerS {

    public static void main(String[] args) {

        System.out.println(BiggerS("zebra", "telephone"));

    }

    public static String BiggerS(String s1, String s2) {

        if(s1.length() > s2.length()) {

            return s1;

        } else {

            return s2;

        }

    }

}
