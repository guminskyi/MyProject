package MethodsWithReturn;

public class WordCount {

    public static void main(String[] args) {

        System.out.println(WordCount("you suck"));

    }

    public static int WordCount(String word) {

        int count = 0;

        String[] splitted = word.split(" ");

        for(String wrd : splitted) {
            count++;
        }

        return count;

    }

}
