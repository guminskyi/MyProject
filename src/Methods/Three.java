package Methods;

public class Three {
    public static void main(String[] args) {

//        3. Write a Java method to display the middle character of a string. Go to the editor
//        Note: a) If the length of the string is odd there will be two middle characters.
//        b) If the length of the string is even there will be one middle character.
//        Test Data:
//        Input a string: 350
//        Expected Output:
//
//
//        The middle character in the string: 5

        String inputOdd = "350";
        String inputEven = "wolf";

        System.out.println(inputOdd.charAt(inputOdd.length() / 2));
        System.out.println(inputEven.substring((inputEven.length() / 2) - 1, (inputEven.length() / 2) + 1));

    }

}
