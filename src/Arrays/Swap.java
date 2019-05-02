package Arrays;

import java.util.ArrayList;

public class Swap {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");

        System.out.println(words);

        Swap(words, 2, 1);

        System.out.println(words);

    }

    public static void Swap(ArrayList<String> words, int idx, int swappingIdx) {

        String swapWord = words.get(idx);

        for(int i = 0; i < words.size(); i++) {

            if(i == idx) {
                words.set(i, words.get(swappingIdx));
                words.set(swappingIdx, swapWord);
            }

        }

    }

}
