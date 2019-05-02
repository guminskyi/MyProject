package stringManipPractice;

public class Strings01 {
    public static void main(String[] args) {

        String greeting = "Hello World!";

        System.out.println(greeting.length());
        int length = greeting.length();
        System.out.println("Length: " + length);

        System.out.println(greeting.charAt(0));
        char firstChar = greeting.charAt(0);
        System.out.println("First Char: " + firstChar);

        System.out.println(greeting.charAt(greeting.length() - 1));
        char lastChar = greeting.charAt(greeting.length() - 1);
        System.out.println("Last Char: " + lastChar);



    }
}
