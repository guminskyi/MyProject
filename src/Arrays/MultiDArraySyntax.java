package Arrays;

import java.util.Arrays;

public class MultiDArraySyntax {
    public static void main(String[] args) {

        double[][] prices = new double[3][];
        prices[0] = new double[] {234.34,234.56};
        prices[1] = new double[] {232.2,100.4};
        prices[2] = new double[5];
        prices[2][0] = 543.34;
        prices[2][1] = 6543;
        prices[2][2] = 123.54;
        prices[2][3] = 235235;
        prices[2][4] = 124;

        System.out.println(Arrays.toString(prices[0]));
        System.out.println(Arrays.toString(prices[1]));
        System.out.println(Arrays.toString(prices[2]));

        System.out.println(Arrays.deepToString(prices));

    }
}
