package NestedLoops;

public class MultiplicationTable2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {

                int result = i * j;
                System.out.print(result + " ");

            }
            System.out.println();
        }



    }
}
