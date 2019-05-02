package NestedLoops;

public class Multiplication {
    public static void main(String[] args) {

        System.out.println();

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println(i + " x " + j + " = " + result);
            }
             if (i >= 1 && i < 10) {
                 System.out.println("===========");
             }
             else {
                 System.out.println();
             }
        }

    }
}
