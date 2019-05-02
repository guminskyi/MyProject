package ForLoops;

public class Continue {
    public static void main(String[] args) {

//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//            break;
//        }

//        for (int i = 1; i <= 5; i++) {
//            break;
//            System.out.println(i); // unreachable code, won't compile

//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//
//            if (i > 2) {
//                break;
//            }
//        }

//        for (int k = 0; k <= 10; k++) {
//            if (k >= 1 && k <= 2) {
//                continue;
//            }
//            System.out.println("Value of k: " + k);
//        }


        // loop thru nums 1-50
        // print each num in the same line, separated by space
        // if a num is divisible by 5 -> skip it
        // if a num is divisible by 20 -> exit the loop

        for (int n = 0; n <= 50; n++) {
            if (n % 20 == 0 && n != 0) {
                break;
            }
            if (n % 5 == 0) {
                continue;
            }

            System.out.print(n + " ");
        }



    }
}
