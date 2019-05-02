package MethodsWithReturn;

public class LimitChars {

    public static void main(String[] args) {

        System.out.println(LimitChars("zebra", 2));

    }


    public static String LimitChars(String word, int limit) {

        return word.substring(0,limit);

    }

}
