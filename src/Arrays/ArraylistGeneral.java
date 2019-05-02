package Arrays;

import java.util.ArrayList;

public class ArraylistGeneral {
    public static void main(String[] args) {
        // create a general (raw type) arrayList
        // we can add any type of data into it
        ArrayList list = new ArrayList();
        list.add("Java");
        list.add(1234);
        list.add(true);

        System.out.println(list);

        list.add(false);
        list.add('A');
        list.add(450.2);
        list.add("_");

        System.out.println(list);

        System.out.println(list.get(0));

        System.out.println(list.size());

    }

}
