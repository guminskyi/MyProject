package ForLoops;

public class OddSquare {
    public static void main(String[] args) {

//        for (int i = 0; i <= 20; i++) {
//            if (i % 2 == 1) {
//                System.out.print(i * i + " ");
//
//            }
//        }

        int i = 1;
        while (i <= 20) {
            if (i % 2 == 1) {
                System.out.print(i * i + " ");
            }
            i++;
        }



    }
}
