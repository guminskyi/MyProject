package Arrays;

import java.util.ArrayList;

public class ReplItPractice {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(3);

        names.add("James");
        names.add("John");
        names.add("Jane");

        System.out.println(names);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(2);
        nums.add(8);
        nums.add(1);
        nums.add(-1);

        nums.set(2,99);
        nums.set(0,100);

        System.out.println(nums);

        ArrayList<String> words = new ArrayList<>();
        words.add("John");
        words.add("James");
        words.add("Janes");

        words.add(0, "hey");
        words.add(3, "yo");

        System.out.println(words);



    }

}
