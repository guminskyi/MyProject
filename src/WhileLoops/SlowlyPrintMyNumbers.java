package WhileLoops;

public class SlowlyPrintMyNumbers {
    public static void main(String[] args) throws InterruptedException {

     int num = 1;

     while (num <= 10) {
         System.out.print(num + " ");
         num++;
         Thread.sleep(1000); // pause the execution for 1 second
     }


    }
}
