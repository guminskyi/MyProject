package Arrays;

import java.util.Arrays;
import java.util.ArrayList;

public class RemoveAll {

    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("hi");
        wordList.add("hey");
        wordList.add("hi");
        wordList.add("hello");

        String targetWord = "hi";

        RemoveAll(wordList, targetWord);

        System.out.println(wordList);

    }

    public static void RemoveAll(ArrayList<String> wordList, String targetWord) {

        for(int i = 0; i < wordList.size(); i++) {
            if(wordList.get(i).equals(targetWord)) {
               wordList.remove(wordList.get(i));
            }
        }

    }

}
