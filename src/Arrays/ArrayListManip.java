package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListManip {

    public static void main(String[] args) {
        Integer[] nums = {123,34,23,656};
        List<Integer> numsList = Arrays.asList(nums);

        System.out.println(numsList);

        ArrayList<Integer> list2 = new ArrayList<>(numsList.size());
        list2.add(list2.size(), 789);
        list2.addAll(numsList);
        list2.remove(2);

        System.out.println(list2);

        // create AL fruits using 5 different ways

        ArrayList<String> fruits1 = new ArrayList<>();
        List<String> fruits2 = new ArrayList<>();
        List<String> fruits3 = new ArrayList<>(10);
        ArrayList<Integer> fruits4 = new ArrayList<>(list2);
        List<String> fruits5 = Arrays.asList(new String[]{"Watermelon", "Peach", "Kiwi"});

        // fruits5.remove("Peach"); => UnsupportedOperationException

        List<String> fruits6 = new ArrayList<>(fruits5);
        fruits6.add("Cherry");

        List<String> fruits7 = new ArrayList<>(Arrays.asList(new String[] {"Plum", "Cherry", "Mango"}));
        fruits7.add("Banana");

        fruits1.add("Grapes");
        fruits1.add("Tomato");
        fruits1.add(2, "Strawberries");

        System.out.println(fruits1);

        fruits2.addAll(fruits1);
        fruits2.add("Dragon Fruit");
        System.out.println(fruits2);

        fruits1.remove(fruits1.size() - 1);
        System.out.println(fruits1);

        // remove all elements of fruits1 from fruits2

        fruits2.removeAll(fruits1);
        System.out.println(fruits2);

        // * * *

        List<Integer> numbers = new ArrayList<>();

         numbers.add(3);
         numbers.add(100);
         numbers.add(500);

         // remove 100

        numbers.remove(new Integer(3));
        System.out.println(numbers);

    }





}
