package Methods;

public class One {

    public static void main(String[] args) {

//        1. Write a Java method to find the smallest number among three numbers. Go to the editor
//        Test Data:
//        Input the first number: 25
//        Input the Second number: 37
//        Input the third number: 29
//        Expected Output:
//
//        The smallest value is 25.0

        int num1 = 25;
        int num2 = 37;
        int num3 = 29;

        if (num1 < num2 && num1 < num3) {
            System.out.println("The smallest value is " + num1);
        }
        else if (num2 < num1 && num2 < num3) {
            System.out.println("The smallest value is " + num2);
        }
        else {
            System.out.println("The smallest value is " + num3);
        }
    }
}
