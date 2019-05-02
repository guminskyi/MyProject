package NestedLoops;

public class PRCTC {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        for (int l = 5; l >= 1; l--) {
            for (int o = 1; o <= l; o++) {
                System.out.print(l);
            }
            System.out.println();
        }


        for (int z = 1; z <= 5; z++) {

            for (int t = 1; t <= z; t++) {
                System.out.print(z);
            }

        }
    }
}
