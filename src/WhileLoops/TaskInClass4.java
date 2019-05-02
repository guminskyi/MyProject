package WhileLoops;

public class TaskInClass4 {
    public static void main(String[] args) {

        int num = 0;
        int sum = 0;

//        while (num <= 20) {
//            if (num % 2 == 0) {
//                System.out.print(num + "= ");
//                sum += num;
//                System.out.println(sum + "+ ");
//                num += 2;
//            }
//        }

          do {
              if (num % 2 == 0) {
                  System.out.print(num + "= ");
                  sum += num;
                  System.out.println(sum + "+ ");
                  num += 2;
              }
          } while (num <= 20);

    }
}
