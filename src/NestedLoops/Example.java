package NestedLoops;

public class Example {
    public static void main(String[] args) {

        // write a program that prints numbers from 1 to 10 in
        // same line, separated by space
        // add one more loop, and put lines 10-13 inside it 5 times


//        for (int j = 1; j <= 5; j++) {
//
//            for (int i = 1; i <= 10; i++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//
//        }

        for (int k = 1; k <= 10; k++) {

            int o = 1;

            while (o <= k) {
                System.out.print(o);
                o++;
            }

            System.out.println();
        }

        for (int p = 9; p >= 1; p--) {

            for (int q = 1; q <= p; q++) {
                System.out.print(q);
            }

            System.out.println();

        }






        System.out.println("Outside the loop");


    }
}
