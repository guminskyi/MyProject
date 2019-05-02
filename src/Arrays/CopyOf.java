package Arrays;

import java.util.Arrays;

public class CopyOf {
    public static void main(String[] args) {

        int[] a = {10,20,30};
        int[] b = Arrays.copyOf(a, 2);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int[] c = Arrays.copyOf(a, 5);
        System.out.println(Arrays.toString(c));

        a = Arrays.copyOf(a, 4);
        a[3] = 100;
        System.out.println(Arrays.toString(a));


    }
}
