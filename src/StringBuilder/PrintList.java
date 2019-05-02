package StringBuilder;

import java.util.*;

public class PrintList {

    public static void main(String[] args) {

        List<List<String>> listOfLists = new ArrayList<>();
        List<String> x = new ArrayList<>();
        x.add("hi");
        x.add("hello");
        List<String> y = new ArrayList<>();
        y.add("hey");
        y.add("sup");
        listOfLists.add(x);
        listOfLists.add(y);

        System.out.println(PrintList(listOfLists));

    }

    public static String PrintList(List<List<String>> listOfLists) {

        String you = "";

        for(int i = 0; i < listOfLists.size(); i++) {
            for(int j = 0; j < listOfLists.get(i).size(); j++) {
                you += listOfLists.get(i).get(j);
            }
        }

        return you;

    }

}
