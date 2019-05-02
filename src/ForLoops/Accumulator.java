package ForLoops;

public class Accumulator {
    public static void main(String[] args) {

          int sum1 = 0;
          int sum2 = 0;
//
//        for (int i = 1; i <= 5; i++) {
//            sum += i;
//        }
//
//        System.out.println("Sum is: " + sum);

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                sum1 += i;
            }
            else {
                sum2 += i;
            }
        }

        System.out.println("Sum of all odd nums is: " + sum1);

        System.out.println("Sum of all even nums is: " + sum2);

    }
}
