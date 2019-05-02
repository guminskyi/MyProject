package MethodsWithReturn;

import java.util.ArrayList;

public class Search {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("one apple");
        strings.add("two orange");
        strings.add("four banana");

        String find = "four";

        System.out.println(Search(strings,find));

    }

    public static boolean Search(ArrayList<String> strings, String find) {

        String fail = "Search failed";

        boolean found = false;
        int i = 0;

        while(i < strings.size()) {

            if(strings.get(i).contains(find)) {
               found = true;
               System.out.println(strings.get(i));
               break;

            }
            else {
               found = false;
                System.out.println("There's no " + find + " in " + strings.get(i) + ". " + fail + " in this index");
            }

            i++;


        }

        return found;

    }

}
