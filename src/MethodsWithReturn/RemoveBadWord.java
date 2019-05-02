package MethodsWithReturn;

public class RemoveBadWord {

    public static void main(String[] args) {

        System.out.println(RemoveBadWord("my fucking life", "my").trim());

    }

    public static String RemoveBadWord(String big, String badWord) {

        return big.replaceAll(badWord, "");

    }

}
