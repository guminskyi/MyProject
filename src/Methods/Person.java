package Methods;

public class Person {

    public static void main(String[] args) {

        String info = "john,doe,30";
        Person(info.toUpperCase());

    }

    public static void Person(String info) {

        String[] splitted = info.split(",");

        System.out.println("Name: " + splitted[0]);
        System.out.println("Last name: " + splitted[1]);
        System.out.println("Age: " + splitted[2]);

    }

}
