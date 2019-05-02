package WhileLoops;

public class MultipleOf7 {
    public static void main(String[] args) {

       int count = 1;

       while (count <= 10 && count % 7 != 0) {
           System.out.println(count);
           count++;

           if (count % 7 == 0) {
               System.out.println(count); // we have to do this bc otherwise a multiple of 7 doesn't get printed
               System.out.println("Multiple of 7 found. End of program.");
           }
       }
    }
}
