package Arrays;

import java.util.ArrayList;

public class RemoveDoubles {

    public static void main(String[] args) {

        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(2.4);
        doubles.add(3.6);
        doubles.add(4.8);
        doubles.add(1.2);

        System.out.println(RemoveDoubles(doubles));

    }

    public static ArrayList<Double> RemoveDoubles (ArrayList<Double> doubles) {

        doubles.remove(0);
        doubles.remove(0);

        return doubles;

    }

}
