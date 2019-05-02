package ForLoops;

public class SumEven {
    public static void main(String[] args) {

        int sum = 0;
        int i = 0;

//        for (int i = 0; i <= 20; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);

        while (i <= 20) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);

    }
}
