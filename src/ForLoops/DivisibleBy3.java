package ForLoops;

public class DivisibleBy3 {
    public static void main(String[] args) {

//        for (int i = 1; i <= 20; i++) {
//            if (i % 3 == 0) {
//                System.out.print(i + " ");
//            }
//        }

       int i = 1;

       while (i <= 20) {
           if (i % 3 == 0) {
               System.out.print(i + " ");
           }
           i++;
       }

    }
}
