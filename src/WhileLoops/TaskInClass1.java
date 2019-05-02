package WhileLoops;

public class TaskInClass1 {
    public static void main(String[] args) {

//        int num = 1;
//
//        while (num <= 30) {
//            if (num % 2 == 0) {
//                System.out.println(num);
//            }
//            num++;
//        }

        int k = 0;
        for (int i = 10; i > 0; i--){
            while (i > 3) i -= 3; //i= 10,7,4,1
            k += 1; //i = 1;
        }
        System.out.println(k);
    }
}

