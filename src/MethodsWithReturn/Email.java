package MethodsWithReturn;

public class Email {

    // getFirstName, getLastName
    // call them and build an email
    // String eamil = [firstName] [lastName] @ gmail.com

    public static void main(String[] args) {
        System.out.println("Email is: " + getFirstName() + "_" + getLastName() + "@gmail.com");
    }

    public static String getFirstName() {
        String firstName = "john";
        return firstName;
    }

    public static String getLastName() {
        String lastName = "doe";
        return lastName;
    }


}
