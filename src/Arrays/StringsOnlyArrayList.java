package Arrays;

import java.util.ArrayList;

public class StringsOnlyArrayList {
    public static void main(String[] args) {

//        ArrayList<String> names;
//        names = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        names.add("Ali");
        names.add("James");
        names.add("12345");

        // print all in the same line

        System.out.println(names);

        int length = names.size();
        System.out.println("Length of names: " + length);

        String first = names.get(0);

        System.out.println(first);

        String last = names.get(names.size() - 1);

        System.out.println(last);

        // remove the element from the list

        names.remove(0);
        System.out.println(names);

        names.remove("12345");
        System.out.println(names);

        System.out.println(names.toString());

    }
}
