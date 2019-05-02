package ForLoops;

public class SumOdd {
    public static void main(String[] args) {

        int sum = 0;
        int i = 0;

//        for (int i = 0; i < 20; i++) {
//            if (i % 2 == 1) {
//                sum += i;
//                System.out.print(sum + " ");
//            }
//        }

        while (i < 20) {
            if (i % 2 == 1) {
                sum += i;
                System.out.print(sum + " ");
            }
            i++;
        }

    }
}
