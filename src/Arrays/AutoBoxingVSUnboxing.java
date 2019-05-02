package Arrays;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingVSUnboxing {
    public static void main(String[] args) {

        int i = 100;
        Integer i2 = i;

        boolean b = true;
        Boolean b2 = b;

        List<Integer> nums = new ArrayList<>(); // still auto-boxing
        nums.add(433);
        int p = 555;
        nums.add(p);
        nums.add(new Integer(77));

        System.out.println(nums);

        Character chObj = '^'; // unboxing
        char myChar = chObj;
        System.out.println(myChar);

    }
}
