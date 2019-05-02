package MethodsWithReturn;

public class Reverse {

    public static void main(String[] args) {

        System.out.println(Reverse("zebra"));

    }

    public static String Reverse(String word) {

        String wordReversed = "";

        for(int i = word.length() - 1; i >= 0; i--) {

            wordReversed += word.substring(i,i+1);

        }

        return wordReversed;

    }

}
