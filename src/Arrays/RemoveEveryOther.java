package Arrays;

import java.util.ArrayList;

public class RemoveEveryOther {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("hi");
        words.add("yo");
        words.add("sup");
        words.add("yolo");
        words.add("boop");

        RemoveEveryOther(words);

        System.out.println(words);

    }

    public static void RemoveEveryOther(ArrayList<String> words) {

//        for(int i = 0; i < words.size(); i++) {
//
//            if(!words.get(i).contains("y") || !words.get(i).contains("o")) {
//                words.remove(words.get(i));
//            }
//
//        }

        for(int i = 0; i < words.size(); i++) {

            if(i % 2 == 1) {
                words.remove(words.get(i));
            }

            if(i % 2 == 0) {
                words.remove(words.get(i));
            }

        }

    }

}
