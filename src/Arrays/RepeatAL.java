package Arrays;

import java.util.ArrayList;

public class RepeatAL {

    public static void main(String[] args) {

        ArrayList<Boolean> bools = new ArrayList<>();
        bools.add(true);
        bools.add(false);
        bools.add(false);

        RepeatAL(bools);

        System.out.println(bools);

    }

    public static void RepeatAL(ArrayList<Boolean> bools) {

        bools.addAll(bools);

    }

}
