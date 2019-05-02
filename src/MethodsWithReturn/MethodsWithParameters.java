package MethodsWithReturn;

public class MethodsWithParameters {

    // buildEmail that will accept a firstname and lastname
    // and return a full email by adding @gmail.com

    public static void main(String[] args) {
        String newEmail = buildEmail("john", "doe");
        System.out.println(newEmail);

        System.out.println( buildEmail("mike", "smith") );
    }

    public static String buildEmail(String firstName, String lastName) {
        String email = firstName.toLowerCase() + "_" + lastName.toLowerCase() + "@gmail.com";
        return email;
    }


}
