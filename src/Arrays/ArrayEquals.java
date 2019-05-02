package Arrays;

import java.util.Arrays;

public class ArrayEquals {
    public static void main(String[] args) {

        int[] a = {10,20,30};
        int[] b = {10,20,30};
        int[] c = {10,20,30,40};
        int[] d = {10,20,40,30};

        System.out.println(Arrays.equals(a,b));
        System.out.println(Arrays.equals(b,c));
        System.out.println(Arrays.equals(c,d));

        Arrays.sort(d);

        System.out.println(Arrays.equals(c,d));

        int[] j = a;

        System.out.println(Arrays.toString(a));
        System.out.println(a == j);

        j[0] = 1000;
        System.out.println(Arrays.toString(j));
        System.out.println(Arrays.toString(a));

    }
}
