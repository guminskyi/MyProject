package WhileLoops;

public class PrintEvens {
    public static void main(String[] args) {

        // using if condition within while loop:
        // start var number with 1
        // loop until 100
        // check if number is even
        // if it is even, print the number

        int number = 1;

        while (number <= 100) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}
