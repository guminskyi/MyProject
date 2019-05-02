package NestedLoops;

public class Practice {
    public static void main(String[] args) {
//
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }
//
//        System.out.println("=====");
//
//        for (int k = 5; k >= 1; k--) {
//            for (int l = 1; l <= k; l++) {
//                System.out.print(k);
//            }
//            System.out.println();
//        }

        for (int outer = 1; outer <= 5; outer++) {
            for (int mid = 1; mid <= (5 - outer); mid++) {
                System.out.print(" ");
            }
            for (int inner = 1; inner <= outer; inner++) {
                System.out.print(outer);
            }
            System.out.println();
        }

        for (int l = 5; l >= 1; l--) {
            for (int m = 1; m <= (5 - l); m++) {
                System.out.print(" ");
            }
            for (int n = 1; n <= l; n++) {
                System.out.print(l);
            }
            System.out.println();
        }

    }
}
